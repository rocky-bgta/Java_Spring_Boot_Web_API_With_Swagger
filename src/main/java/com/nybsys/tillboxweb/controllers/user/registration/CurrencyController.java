/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/9/2018
 * Time: 10:37 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.controllers.user.registration;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.UserRegistrationModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.user.registration.CurrencyModel;
import com.nybsys.tillboxweb.models.user.registration.VMCurrencyExchangeRateRequestModel;
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
@RequestMapping(UserRegistrationModuleConstant.CURRENCY_BASE_URL)
@Api(tags = "User-Registration",value = UserRegistrationModuleConstant.CURRENCY_CONTROLLER_NAME, description = UserRegistrationModuleConstant.CURRENCY_CONTROLLER_DESCRIPTION)
public class CurrencyController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = UserRegistrationModuleConstant.CURRENCY_SAVE_SERVICE_LINK_DESCRIPTION, response = CurrencyModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.CURRENCY_BASE_URL + UserRegistrationModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.BASE_CURRENCY_GET_SERVICE_LINK_DESCRIPTION, response = CurrencyModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.BASE_CURRENCY_GET_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getBaseCurrency(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.CURRENCY_BASE_URL + UserRegistrationModuleConstant.BASE_CURRENCY_GET_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.CURRENCY_SEARCH_SERVICE_LINK_DESCRIPTION, response = CurrencyModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.CURRENCY_BASE_URL + UserRegistrationModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.CURRENCY_GET_ALL_SERVICE_LINK_DESCRIPTION, response = CurrencyModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.GET_ALL_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAll(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.CURRENCY_BASE_URL + UserRegistrationModuleConstant.GET_ALL_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.CURRENCY_SELECT_SERVICE_LINK_DESCRIPTION, response = CurrencyModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.SELECT_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage selectCurrentCurrency(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.CURRENCY_BASE_URL + UserRegistrationModuleConstant.SELECT_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = UserRegistrationModuleConstant.CURRENCY_GET_CURRENCY_EXCHANGE_RATE_SERVICE_LINK_DESCRIPTION, response = VMCurrencyExchangeRateRequestModel.class)
    @RequestMapping(value = UserRegistrationModuleConstant.CURRENCY_GET_CURRENCY_EXCHANGE_RATE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAllTodaysCurrencyExchangeRateByBusinessID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(UserRegistrationModuleConstant.CURRENCY_BASE_URL + UserRegistrationModuleConstant.CURRENCY_GET_CURRENCY_EXCHANGE_RATE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
}
