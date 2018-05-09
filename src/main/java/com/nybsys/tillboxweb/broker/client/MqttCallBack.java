/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 12-Jan-18
 * Time: 4:42 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.broker.client;


import com.nybsys.tillboxweb.core.Core;
import com.nybsys.tillboxweb.core.ResponseMessage;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MqttCallBack implements MqttCallback {
    private static final Logger log = LoggerFactory.getLogger(MqttCallBack.class);

    private ResponseMessage responseMessage;
    private Object lock;

    public void connectionLost(Throwable throwable) {
        log.info("Connection to MQTT broker lost!");
    }

    public void messageArrived(String s, MqttMessage mqttMessage) throws Exception {

        String incomingMessage;

        incomingMessage = new String(mqttMessage.getPayload());

        try {
            this.responseMessage = Core.jsonMapper.readValue(incomingMessage, ResponseMessage.class);
        }catch (Exception ex){
                ex.printStackTrace();
        }


        if (incomingMessage == null) {
            throw new Exception();
        }

        synchronized (this.lock){
            this.lock.notifyAll();
        }

    }

    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
    }

    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setLock(Object lock) {
        this.lock = lock;
    }
}
