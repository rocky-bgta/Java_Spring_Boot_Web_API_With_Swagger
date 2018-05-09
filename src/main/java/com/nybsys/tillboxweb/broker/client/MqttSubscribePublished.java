package com.nybsys.tillboxweb.broker.client;

import com.nybsys.tillboxweb.appenum.TillBoxAppEnum;
import com.nybsys.tillboxweb.constant.TillBoxAppConstant;
import com.nybsys.tillboxweb.core.Core;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttSubscribePublished extends Core {

    private final Logger log = LoggerFactory.getLogger(MqttSubscribePublished.class);
    private final Integer allowedTime = TillBoxAppConstant.allowedTime;

    private String publishedTopic;


    private ResponseMessage responseMessage = null;
    private MqttClient mqttClient;
    private MqttMessage mqttMessage;
    private MqttCallBack mqttCallBack;


    public ResponseMessage getResponseMessage(String serviceName, RequestMessage requestMessage) {
        String jsonString;
        String subscriptionTopic;
        String messageId;
        Object lock;
        messageId = getUUID();
        subscriptionTopic = messageId;


        requestMessage.brokerMessage.messageId = messageId;
        requestMessage.brokerMessage.serviceName = serviceName;
        requestMessage.brokerMessage.qos = QoS;
        requestMessage.brokerMessage.requestFrom =
                TillBoxAppEnum.BrokerRequestType.API_CONTROLLER.get();

        try {
            lock = new Object();
            mqttClient = MqttUtils.getMqttClient();
            mqttCallBack = new MqttCallBack();
            mqttCallBack.setLock(lock);
            mqttClient.setCallback(mqttCallBack);

            if (mqttClient.isConnected()) {
                mqttClient.subscribe(subscriptionTopic, QoS);

                jsonString = Core.jsonMapper.writeValueAsString(requestMessage);

                this.mqttMessage = MqttUtils.getMqttDefaultMessage();
                this.mqttMessage.setPayload(jsonString.getBytes());


                mqttClient.publish(this.publishedTopic, this.mqttMessage);

                try {
                    synchronized (lock) {
                        //this.allowed Time 45 second allowedTime
                        //allowedTime = 45000;
                        lock.wait(this.allowedTime);
                        this.responseMessage = this.mqttCallBack.getResponseMessage();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    mqttClient.unsubscribe(subscriptionTopic);
                    mqttClient.disconnect();
                }
                log.info("Number of Request serve: " + Core.numberOfRequestServe.incrementAndGet());

            } else {
                this.responseMessage = new ResponseMessage();
                this.responseMessage.message = "Sorry try again later";
                log.info("Request not serve no: " + Core.numberOfRequestServeNotServe.incrementAndGet());
            }

        } catch (Exception ex) {
            log.error("Exception from  getResponseMessage method");
            ex.printStackTrace();
        }
        return this.responseMessage;
    }

    public void setPublishedTopic(String publishedTopic) {
        this.publishedTopic = publishedTopic;
    }
}
