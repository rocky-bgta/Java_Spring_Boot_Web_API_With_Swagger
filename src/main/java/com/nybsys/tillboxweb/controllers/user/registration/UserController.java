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
import com.nybsys.tillboxweb.models.user.registration.RegistrationInvitationModel;
import com.nybsys.tillboxweb.models.user.registration.TokenModel;
import com.nybsys.tillboxweb.models.user.registration.UserModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_SECURITY_TOPIC;
import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_USER_REGISTRATION_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_SECURITY_MODULE_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_USER_REGISTRATION_MODULE_TOPIC;

@RestController
@RequestMapping(UserRegistrationModuleConstant.USER_BASE_URL)
@Api(tags = "User-Registration",value = UserRegistrationModuleConstant.USER_CONTROLLER_NAME, description = UserRegistrationModuleConstant.USER_CONTROLLER_DESCRIPTION)
public class UserController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = UserRegistrationModuleConstant.USER_SIGN_UP_SERVICE_LINK_DESCRIPTION, response = RegistrationInvitationModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.USER_SIGN_UP_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage signUpInvitation(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.USER_SIGN_UP_SERVICE_LINK, requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.USER_SIGN_UP_CONFIRMATION_SERVICE_LINK_DESCRIPTION, response = TokenModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.USER_SIGN_UP_CONFIRMATION_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage signUp(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.USER_SIGN_UP_CONFIRMATION_SERVICE_LINK, requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.USER_LOGIN_SERVICE_LINK_DESCRIPTION, response = UserModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.USER_LOGIN_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage login(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {

            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.USER_LOGIN_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.USER_GET_ALL_SERVICE_LINK_DESCRIPTION, response = UserModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.GET_ALL_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAllUsers(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.GET_ALL_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.USER_GET_BY_ID_LINK_DESCRIPTION, response = UserModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getUserById(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage( UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.USER_GET_ACTIVE_USER_LIST_BY_BUSINESS_ID_SERVICE_LINK_DESCRIPTION, response = UserModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.USER_GET_ACTIVE_USER_LIST_BY_BUSINESS_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getUserListByBusinessID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.USER_GET_ACTIVE_USER_LIST_BY_BUSINESS_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = UserRegistrationModuleConstant.USER_GET_ACTIVE_INACTIVE_INVITED_USER_LIST_BY_BUSINESS_ID_SERVICE_LINK_DESCRIPTION, response = UserModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.USER_GET_ACTIVE_INACTIVE_INVITED_USER_LIST_BY_BUSINESS_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getUserListActiveAndInactiveAndInvited(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.USER_GET_ACTIVE_INACTIVE_INVITED_USER_LIST_BY_BUSINESS_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = UserRegistrationModuleConstant.USER_EDIT_SERVICE_LINK_DESCRIPTION, response = UserModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.USER_EDIT_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage editUser(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.USER_EDIT_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.USER_ACTIVE_SERVICE_LINK_DESCRIPTION, response = UserModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.USER_ACTIVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage activateUser(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.USER_ACTIVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.USER_INACTIVE_SERVICE_LINK_DESCRIPTION, response = UserModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.USER_INACTIVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage inActivateUser(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.USER_BASE_URL+UserRegistrationModuleConstant.USER_INACTIVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "Update user by conditions", response = UserModel.class)
    @RequestMapping(value = "updateByCondition", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage updateByConditions(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/user/updateByCondition", requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "Delete user by conditions", response = UserModel.class)
    @RequestMapping(value = "deleteByCondition", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage deleteByConditions(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/user/deleteByCondition", requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "Check InterCom", response = UserModel.class)
    @RequestMapping(value = "checkInterCom", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage checkInterCom(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/user/checkInterCom", requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "History Test", response = UserModel.class)
    @RequestMapping(value = "historyTest", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage historyTest(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/user/historyTest", requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
}
