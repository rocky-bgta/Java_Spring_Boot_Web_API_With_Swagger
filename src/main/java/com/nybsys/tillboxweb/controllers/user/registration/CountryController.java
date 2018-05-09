/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 29-Dec-17
 * Time: 2:47 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.controllers.user.registration;

import com.nybsys.tillboxweb.broker.client.MqttCallBack;
import com.nybsys.tillboxweb.broker.client.MqttUtils;
import com.nybsys.tillboxweb.core.Core;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.user.registration.CountryModel;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static com.nybsys.tillboxweb.core.Core.QoS;

@RestController
@RequestMapping("api/country/")
public class CountryController {

    final static String countryPublishedTopic="countryPublishedTopic";
    final static String countrySubscriptionTopic="countrySubscriptionTopic";
    private static MqttClient mqttClient;

    static {
        try {
            mqttClient = MqttUtils.getMqttClient();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    @ApiOperation(value = "", response = CountryModel.class)
    @RequestMapping(value = "getAll", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAll(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        String jsonString;
            try {

                Object lock = new Object();
                MqttCallBack mqttCallBack = new MqttCallBack();
                mqttCallBack.setLock(lock);
                mqttClient.setCallback(mqttCallBack);
                mqttClient.subscribe(countrySubscriptionTopic,QoS);

                String uuid = UUID.randomUUID().toString();

                MqttMessage mqttMessage;
                mqttMessage = MqttUtils.getMqttDefaultMessage();
                requestMessage.token = uuid;
                jsonString = Core.jsonMapper.writeValueAsString(requestMessage);
                mqttMessage.setPayload(jsonString.getBytes());
                mqttClient.publish(countryPublishedTopic,mqttMessage);

                synchronized (lock){
                    lock.wait();
                }

                responseMessage = mqttCallBack.getResponseMessage();

            }catch (Exception ex){
                ex.printStackTrace();
            }

        return responseMessage;
    }
}
