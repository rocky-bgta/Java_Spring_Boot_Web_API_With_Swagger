package com.nybsys.tillboxweb.broker.client;

import com.nybsys.tillboxweb.core.Core;
import com.nybsys.tillboxweb.core.ResponseMessage;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BrokerClientCallBack extends Core implements MqttCallback {

    private ResponseMessage responseMessage;
    //private String removeMessageId = null;

    private Object lockObject;

    public BrokerClientCallBack() {
        super();
    }

    /*public BrokerClientCallBack(Object lockObject) {
        this.lockObject = lockObject;
    }*/

    public void setLockObject(Object lockObject) {
        this.lockObject = lockObject;
    }

    public void connectionLost(Throwable throwable) {
        System.out.println("Connection to MQTT broker lost!" + throwable);
    }

    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {

        this.responseMessage = null;

        String incomingMessage = new String(mqttMessage.getPayload());

        if (incomingMessage == null)
            throw new Exception();

        this.responseMessage = Core.jsonMapper.readValue(incomingMessage, ResponseMessage.class);

        System.out.println("Response MessageId: "+responseMessage.brokerMessageId);
        try {
            synchronized (this.lockObject) {
                messageIdList.forEach(messageId -> {
                    if (this.responseMessage.brokerMessageId.equals(messageId)) {
                        //System.out.println(item);
                        System.out.println("======== In lock ===========");
                        setResponseMessage(this.responseMessage);
                        //this.removeMessageId = messageId.toString();
                        this.lockObject.notifyAll();
                        System.out.println("======== Lock release ======");
                    }
                });
            }
        } finally {
            //messageIdList.remove(this.removeMessageId);
            //System.out.println("Size lock object: " + messageIdList.size());
        }


        //==============================================================================================================

        /*callBackLock.lock();
        try {

            System.out.println("======== In lock ===========");

            for (Map.Entry<String, Condition> entry : clientLockWithMessageId.entrySet()) {
                String brokerMessageId = entry.getKey().toString();
                //Condition clientLock = entry.getValue();
                if (this.responseMessage.brokerMessageId.equals(brokerMessageId)) {
                    //clientLock.signalAll();
                    this.removeMessageId = brokerMessageId;
                    setResponseMessage(this.responseMessage);
                    entry.getValue().signalAll();
                    System.out.println("======== Lock release ======");
                }
            }


        } finally {
            callBackLock.unlock();
            clientLockWithMessageId.remove(this.removeMessageId);
            System.out.println("Size lock object: " + clientLockWithMessageId.size());
        }*/

        //==============================================================================================================

        System.out.println("======== Message Receive successfully ===========");
    }

    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
    }

    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }
}
