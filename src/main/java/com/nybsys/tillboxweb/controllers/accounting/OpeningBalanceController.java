
package com.nybsys.tillboxweb.controllers.accounting;
import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.AccountModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.accounting.OpeningBalanceModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_ACCOUNTING_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_ACCOUNTING_MODULE_TOPIC;


@RestController
@RequestMapping(AccountModuleConstant.OPENING_BALANCE_BASE_URL)
@Api(tags = "Accounting",value = AccountModuleConstant.OPENING_BALANCE_CONTROLLER_NAME, description = AccountModuleConstant.OPENING_BALANCE_CONTROLLER_DESCRIPTION)
public class OpeningBalanceController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = AccountModuleConstant.OPENING_BALANCE_GET_BY_ACCOUNTID_SERVICE_LINK_DESCRIPTION, response = OpeningBalanceModel.class)
    @RequestMapping(value = AccountModuleConstant.OPENING_BALANCE_GET_BY_ACCOUNTID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getDropDown(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.OPENING_BALANCE_BASE_URL+AccountModuleConstant.OPENING_BALANCE_GET_BY_ACCOUNTID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = AccountModuleConstant.OPENING_BALANCE_GET_BY_BUSINESSID_SERVICE_LINK_DESCRIPTION, response = OpeningBalanceModel.class)
    @RequestMapping(value = AccountModuleConstant.OPENING_BALANCE_GET_BY_BUSINESSID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAccountClassificationList(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage( AccountModuleConstant.OPENING_BALANCE_BASE_URL+AccountModuleConstant.OPENING_BALANCE_GET_BY_BUSINESSID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = AccountModuleConstant.OPENING_BALANCE_GET_BY_BUSINESSID_SERVICE_LINK_DESCRIPTION, response = OpeningBalanceModel.class)
    @RequestMapping(value = AccountModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage( AccountModuleConstant.OPENING_BALANCE_BASE_URL+AccountModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = AccountModuleConstant.OPENING_BALANCE_DELETE_SERVICE_LINK_DESCRIPTION, response = OpeningBalanceModel.class)
    @RequestMapping(value = AccountModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage( AccountModuleConstant.OPENING_BALANCE_BASE_URL+AccountModuleConstant.DELETE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
