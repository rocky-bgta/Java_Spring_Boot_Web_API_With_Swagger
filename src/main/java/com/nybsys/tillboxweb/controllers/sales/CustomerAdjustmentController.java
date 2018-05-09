/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 05/03/2018
 * Time: 10:21
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.controllers.sales;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.SalesModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.accounting.OpeningBalanceModel;
import com.nybsys.tillboxweb.models.sales.CustomerAdjustmentModel;
import com.nybsys.tillboxweb.models.sales.VMCustomerAdjustmentModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_SALES_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_SALES_MODULE_TOPIC;

@RestController
@RequestMapping(SalesModuleConstant.CUSTOMER_ADJUSTMENT_BASE_URL)
@Api(tags = "Sales",value  = SalesModuleConstant.CUSTOMER_ADJUSTMENT_CONTROLLER_NAME,description = SalesModuleConstant.CUSTOMER_ADJUSTMENT_CONTROLLER_DESCRIPTION)
public class CustomerAdjustmentController {
    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_ADJUSTMENT_SAVE_SERVICE_LINK_DESCRIPTION, response = VMCustomerAdjustmentModel.class)
    @RequestMapping(value = SalesModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_ADJUSTMENT_BASE_URL+SalesModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_ADJUSTMENT_SEARCH_SERVICE_LINK_DESCRIPTION, response = CustomerAdjustmentModel.class)
    @RequestMapping(value = SalesModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_ADJUSTMENT_BASE_URL+SalesModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = SalesModuleConstant.CUSTOMER_ADJUSTMENT_GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = CustomerAdjustmentModel.class)
    @RequestMapping(value = SalesModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_ADJUSTMENT_BASE_URL+SalesModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = SalesModuleConstant.CUSTOMER_ADJUSTMENT_DELETE_SERVICE_LINK_DESCRIPTION, response = CustomerAdjustmentModel.class)
    @RequestMapping(value = SalesModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_ADJUSTMENT_BASE_URL+SalesModuleConstant.DELETE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_ADJUSTMENT_ADJUST_OPENING_BALANCE_SERVICE_LINK_DESCRIPTION, response = OpeningBalanceModel.class)
    @RequestMapping(value = SalesModuleConstant.CUSTOMER_ADJUSTMENT_ADJUST_OPENING_BALANCE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage adjustOpeningBalance(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_ADJUSTMENT_BASE_URL+SalesModuleConstant.CUSTOMER_ADJUSTMENT_ADJUST_OPENING_BALANCE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
//    @ApiOperation(value = SalesModuleConstant.CUSTOMER_DUE_BY_INVOICE_ID_SERVICE_LINK_DESCRIPTION, response = CustomerInvoiceModel.class)
//    @RequestMapping(value = SalesModuleConstant.CUSTOMER_DUE_BY_INVOICE_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseMessage getCustomerDueByInvoiceID(@RequestBody RequestMessage requestMessage) throws MqttException {
//        ResponseMessage responseMessage = null;
//        try {
//            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
//            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
//            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_ADJUSTMENT_BASE_URL+SalesModuleConstant.CUSTOMER_DUE_BY_INVOICE_ID_SERVICE_LINK, requestMessage);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return responseMessage;
//    }
}
