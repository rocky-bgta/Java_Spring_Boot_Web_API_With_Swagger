/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 18-Apr-18
 * Time: 3:15 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.controllers.user.registration;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.user.registration.OutStandingBalanceModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_USER_REGISTRATION_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_USER_REGISTRATION_MODULE_TOPIC;

@RestController
@RequestMapping("/api/userRegistration/outStandingBalance/")
@Api(tags = "User-Registration")
public class OutStandingBalanceController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = "OutStandingBalance", response = OutStandingBalanceModel.class)
    @RequestMapping(value = "save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/userRegistration/outStandingBalance/save", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }



    @ApiOperation(value = "OutStandingBalance", response = OutStandingBalanceModel.class)
    @RequestMapping(value = "search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/userRegistration/outStandingBalance/search", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

/*
    @ApiOperation(value = "OutStandingBalance", response = OutStandingBalanceModel.class)
    @RequestMapping(value = "getById", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getById(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/userRegistration/outStandingBalance/getById", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }*/

   /* @ApiOperation(value = "OutStandingBalance", response = OutStandingBalanceModel.class)
    @RequestMapping(value = "delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/userRegistration/outStandingBalance/delete", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }*/



    /*
    
    @ApiOperation(value = "OutStandingBalance", response = OutStandingBalanceModel.class)
    @RequestMapping(value = "inactive", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage inActive(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            //this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/userRegistration/outStandingBalance/inactive", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    
    */
}
    