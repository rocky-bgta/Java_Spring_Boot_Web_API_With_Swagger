/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 28/03/2018
 * Time: 05:56
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.controllers.expense;


import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.ExpenseModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.expense.ExpenseTypeModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_EXPENSE_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_EXPENSE_MODULE_TOPIC;

@RestController
@RequestMapping(ExpenseModuleConstant.EXPENSE_TYPE_BASE_URL)
@Api(tags = "Expense")
public class ExpenseTypeController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = ExpenseModuleConstant.EXPENSE_TYPE_SAVE_SERVICE_LINK_DESCRIPTION, response = ExpenseTypeModel.class)
    @RequestMapping(value = ExpenseModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_EXPENSE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_EXPENSE_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(ExpenseModuleConstant.EXPENSE_TYPE_BASE_URL + ExpenseModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = ExpenseModuleConstant.EXPENSE_TYPE_SEARCH_SERVICE_LINK_DESCRIPTION, response = ExpenseTypeModel.class)
    @RequestMapping(value = ExpenseModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_EXPENSE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_EXPENSE_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(ExpenseModuleConstant.EXPENSE_TYPE_BASE_URL + ExpenseModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = ExpenseModuleConstant.EXPENSE_TYPE_DELETE_SERVICE_LINK_DESCRIPTION, response = ExpenseTypeModel.class)
    @RequestMapping(value = ExpenseModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_EXPENSE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_EXPENSE_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(ExpenseModuleConstant.EXPENSE_TYPE_BASE_URL + ExpenseModuleConstant.DELETE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
}
