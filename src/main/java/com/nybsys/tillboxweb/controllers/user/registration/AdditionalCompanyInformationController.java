/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 29-Dec-17
 * Time: 2:47 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.controllers.user.registration;
import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.UserRegistrationModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.user.registration.AdditionalCompanyInformationModel;
import com.nybsys.tillboxweb.models.user.registration.BusinessContactModel;
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
@RequestMapping(UserRegistrationModuleConstant.ADDITIONAL_COMPANY_INFORMATION_BASE_URL)
@Api(tags = "User-Registration",value = UserRegistrationModuleConstant.ADDITIONAL_COMPANY_INFORMATION_CONTROLLER_NAME, description = UserRegistrationModuleConstant.BUSINESS_CONTACT_CONTROLLER_DESCRIPTION)
public class AdditionalCompanyInformationController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = UserRegistrationModuleConstant.ADDITIONAL_COMPANY_INFORMATION_SAVE_SERVICE_LINK_DESCRIPTION, response = AdditionalCompanyInformationModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.ADDITIONAL_COMPANY_INFORMATION_BASE_URL+UserRegistrationModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.ADDITIONAL_COMPANY_INFORMATION_SEARCH_LINK_DESCRIPTION, response = AdditionalCompanyInformationModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.ADDITIONAL_COMPANY_INFORMATION_BASE_URL+UserRegistrationModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
