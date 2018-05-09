/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 03/02/2018
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.controllers.accounting;
import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.AccountModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.accounting.CombineAccountModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@RequestMapping(AccountModuleConstant.COMBINE_ACCOUNT_BASE_URL)
@Api(tags = "Accounting",value = AccountModuleConstant.COMBINE_ACCOUNT_CONTROLLER_NAME, description = AccountModuleConstant.COMBINE_ACCOUNT_CONTROLLER_DESCRIPTION)
public class CombineAccountController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = AccountModuleConstant.COMBINE_ACCOUNT_SAVE_SERVICE_LINK_DESCRIPTION, response = CombineAccountModel.class)
    @RequestMapping(value = AccountModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.COMBINE_ACCOUNT_BASE_URL+AccountModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = AccountModuleConstant.COMBINE_ACCOUNT_GET_SERVICE_LINK_DESCRIPTION, response = CombineAccountModel.class)
    @RequestMapping(value = AccountModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.COMBINE_ACCOUNT_BASE_URL+AccountModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = AccountModuleConstant.COMBINE_ACCOUNT_SEARCH_SERVICE_LINK_DESCRIPTION, response = CombineAccountModel.class)
    @RequestMapping(value = AccountModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.COMBINE_ACCOUNT_BASE_URL+AccountModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
