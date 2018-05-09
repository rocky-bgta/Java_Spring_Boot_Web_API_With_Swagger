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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class MqttSubscribePublished extends Core {
    private static final Logger log = LoggerFactory.getLogger(MqttSubscribePublished.class);

    public MqttSubscribePublished() {
        super();
    }

    private static MqttClient mqttClient;

    static {
        try {
            mqttClient = MqttUtils.getMqttClient();
        } catch (Exception e) {
            log.error("Exception from Api Controller Publisher");
            e.printStackTrace();
        }
    }

    private static final Integer allowedTime = TillBoxAppConstant.allowedTime;

    private String subscriptionTopic;
    private String publishedTopic;
    private String brokerMessageId;

    private ResponseMessage responseMessage = null;
    private MqttMessage mqttMessage;

    private Object lockObject;

    @Autowired
    private BrokerClientCallBack brokerClientCallBack;




    @PostConstruct
    public void initClass() {
        try {

            this.lockObject = new Object();
            //==========================================================================================================

            //this.brokerClientCallBack = new BrokerClientCallBack(lockObject);

            //this.clientLock = callBackLock.newCondition();
            this.brokerClientCallBack.setLockObject(this.lockObject);
            mqttClient.setCallback(this.brokerClientCallBack);

            //==========================================================================================================

        } catch (Exception ex) {
            System.out.println("Failed to connect with broker");
            ex.printStackTrace();
        }
    }

    public ResponseMessage getResponseMessage(RequestMessage requestMessage) {
        String serviceName = null;
        ResponseMessage responseMessage;
        responseMessage = this.getResponseMessage(serviceName, requestMessage);
        return responseMessage;
    }

    public ResponseMessage getResponseMessage(String serviceName, RequestMessage requestMessage) {

        Runnable runnable = () -> {
            initClass();
        };

        initClass();

        String jsonString;
        this.brokerMessageId = getUUID();
        System.out.println("Published MessageId: "+this.brokerMessageId);
        //clientLockWithMessageId.put(this.brokerMessageId,clientLock);

        messageIdList.add(this.brokerMessageId);

        requestMessage.brokerMessage.messageId = this.brokerMessageId;
        if(serviceName!=null)
            requestMessage.brokerMessage.serviceName = serviceName;

        requestMessage.brokerMessage.qos = QoS;
        requestMessage.brokerMessage.requestFrom =
                TillBoxAppEnum.BrokerRequestType.API_CONTROLLER.get();

        try {

            if (mqttClient.isConnected()) {
                mqttClient.subscribe(subscriptionTopic, QoS);

                jsonString = Core.jsonMapper.writeValueAsString(requestMessage);

                this.mqttMessage = MqttUtils.getMqttDefaultMessage();
                this.mqttMessage.setPayload(jsonString.getBytes());

                log.info("Message published" + Core.messageIdList.size());
                //Thread.sleep(1000);
                mqttClient.publish(publishedTopic, this.mqttMessage);

                try {
                    synchronized (this.lockObject) {
                        //this.allowed Time 45 second allowedTime
                        //allowedTime = 45000;

                        this.lockObject.wait(this.allowedTime);
                        this.responseMessage = this.brokerClientCallBack.getResponseMessage();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    Core.messageIdList.remove(this.brokerMessageId);
                    mqttClient.unsubscribe(subscriptionTopic);

                }
                log.info("Number of pending request: " + Core.messageIdList.size());
                log.info("Number of Request serve: " + Core.numberOfRequestServe.incrementAndGet());
                //==========================================================================================================


                //==========================================================================================================
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

    public void setSubscriptionTopic(String subscriptionTopic) {
        this.subscriptionTopic = subscriptionTopic;
    }

    public void setPublishedTopic(String publishedTopic) {
        this.publishedTopic = publishedTopic;
    }
}
