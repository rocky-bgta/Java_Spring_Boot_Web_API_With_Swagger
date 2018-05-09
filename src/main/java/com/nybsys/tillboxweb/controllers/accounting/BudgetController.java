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
import com.nybsys.tillboxweb.models.accounting.BudgetModel;
import com.nybsys.tillboxweb.models.accounting.VMBudgetDetailModel;
import com.nybsys.tillboxweb.models.accounting.VMBudgetReqModel;
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
@RequestMapping(AccountModuleConstant.BUDGET_BASE_URL)
@Api(tags = "Accounting",value = AccountModuleConstant.BUDGET_CONTROLLER_NAME, description = AccountModuleConstant.BUDGET_CONTROLLER_DESCRIPTION)
public class BudgetController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = AccountModuleConstant.BUDGET_DROP_DOWN_SERVICE_LINK_DESCRIPTION, response = BudgetModel.class)
    @RequestMapping(value = AccountModuleConstant.BUDGET_DROP_DOWN_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getDropDown(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.BUDGET_BASE_URL+AccountModuleConstant.BUDGET_DROP_DOWN_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = AccountModuleConstant.BUDGET_GET_DETAIL_SERVICE_LINK_DESCRIPTION, response = VMBudgetReqModel.class)
    @RequestMapping(value = AccountModuleConstant.BUDGET_GET_DETAIL_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getBudgetDetail(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.BUDGET_BASE_URL+AccountModuleConstant.BUDGET_GET_DETAIL_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = AccountModuleConstant.BUDGET_SAVE_DETAIL_SERVICE_LINK_DESCRIPTION, response = VMBudgetDetailModel.class)
    @RequestMapping(value = AccountModuleConstant.BUDGET_SAVE_DETAIL_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage saveBudgetDetail(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.BUDGET_BASE_URL+AccountModuleConstant.BUDGET_SAVE_DETAIL_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
