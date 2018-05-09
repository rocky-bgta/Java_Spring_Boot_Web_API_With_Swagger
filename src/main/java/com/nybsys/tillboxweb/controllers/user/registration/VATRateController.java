/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 29-Dec-17
 * Time: 2:47 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.controllers.user.registration;

import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.user.registration.VATRateModel;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vatRate/")

public class VATRateController {

   /* @Autowired
    MqttSubscribePublished mqttSubscribePublished;*/
/*
    @ApiOperation(value = UserRegistrationModuleConstant.VAT_RATE_SAVE_SERVICE_LINK_DESCRIPTION, response = VATRateModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            //this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            //responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.VAT_RATE_BASE_URL+UserRegistrationModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }*/

    @ApiOperation(value = "", response = VATRateModel.class)
    @RequestMapping(value = "getAll", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            //this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            //responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.VAT_RATE_BASE_URL+UserRegistrationModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
