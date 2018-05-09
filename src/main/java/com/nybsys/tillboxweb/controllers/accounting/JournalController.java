/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 06/02/2018
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.controllers.accounting;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.AccountModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.accounting.AccountModel;
import com.nybsys.tillboxweb.models.accounting.JournalModel;
import com.nybsys.tillboxweb.models.accounting.VMJournalReqModel;
import com.nybsys.tillboxweb.models.purchase.SupplierModel;
import com.nybsys.tillboxweb.models.sales.CustomerModel;
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
@RequestMapping(AccountModuleConstant.JOURNAL_BASE_URL)
@Api(tags = "Accounting",value = AccountModuleConstant.JOURNAL_CONTROLLER_NAME, description = AccountModuleConstant.JOURNAL_CONTROLLER_DESCRIPTION)
public class JournalController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = AccountModuleConstant.JOURNAL_SAVE_SERVICE_LINK_DESCRIPTION, response = VMJournalReqModel.class)
    @RequestMapping(value = AccountModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage saveJournal(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished= new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = AccountModuleConstant.JOURNAL_SAVE_BYPASS_ENTRY_SERVICE_LINK_DESCRIPTION, response = VMJournalReqModel.class)
    @RequestMapping(value = AccountModuleConstant.JOURNAL_SAVE_BYPASS_ENTRY_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage saveBypassEntryJournal(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished= new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.JOURNAL_SAVE_BYPASS_ENTRY_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = AccountModuleConstant.JOURNAL_AVAILABLE_BALANCE_BY_ACCOUNT_GET_SERVICE_LINK_DESCRIPTION, response = AccountModel.class)
    @RequestMapping(value = AccountModuleConstant.JOURNAL_AVAILABLE_BALANCE_BY_ACCOUNT_GET_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAvailableBalanceByAccount(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished= new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.JOURNAL_AVAILABLE_BALANCE_BY_ACCOUNT_GET_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = AccountModuleConstant.JOURNAL_SUPPLIER_CURRENT_DUE_SERVICE_LINK_DESCRIPTION, response = SupplierModel.class)
    @RequestMapping(value = AccountModuleConstant.JOURNAL_SUPPLIER_CURRENT_DUE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getCurrentDueBySupplierID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished= new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.JOURNAL_SUPPLIER_CURRENT_DUE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = AccountModuleConstant.JOURNAL_CUSTOMER_CURRENT_DUE_SERVICE_LINK_DESCRIPTION, response = CustomerModel.class)
    @RequestMapping(value = AccountModuleConstant.JOURNAL_CUSTOMER_CURRENT_DUE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getCurrentDueByCustomerID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished = new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.JOURNAL_SUPPLIER_CURRENT_DUE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = AccountModuleConstant.JOURNAL_AVAILABLE_BALANCE_BY_PARTYID_GET_SERVICE_LINK_DESCRIPTION, response = JournalModel.class)
    @RequestMapping(value = AccountModuleConstant.JOURNAL_AVAILABLE_BALANCE_BY_PARTYID_GET_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAvailableBalanceByPartyID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished= new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.JOURNAL_AVAILABLE_BALANCE_BY_PARTYID_GET_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = AccountModuleConstant.JOURNAL_SEARCH_SERVICE_LINK_DESCRIPTION, response = JournalModel.class)
    @RequestMapping(value = AccountModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage searchJournal(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished= new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = AccountModuleConstant.JOURNAL_DELETE_SERVICE_LINK_DESCRIPTION, response = JournalModel.class)
    @RequestMapping(value = AccountModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage deleteJournal(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished= new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.DELETE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = AccountModuleConstant.JOURNAL_DATA_EXISTS_EXCLUDE_OPENING_BALANCE_SERVICE_LINK_DESCRIPTION, response = JournalModel.class)
    @RequestMapping(value = AccountModuleConstant.JOURNAL_DATA_EXISTS_EXCLUDE_OPENING_BALANCE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage dataExistsOfJournal(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //mqttSubscribePublished = new MqttSubscribePublished();
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_ACCOUNTING_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_ACCOUNTING_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(AccountModuleConstant.JOURNAL_BASE_URL+AccountModuleConstant.JOURNAL_DATA_EXISTS_EXCLUDE_OPENING_BALANCE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
