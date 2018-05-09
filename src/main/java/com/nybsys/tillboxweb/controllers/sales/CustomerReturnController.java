/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/26/2018
 * Time: 11:58 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.controllers.sales;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.SalesModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.purchase.StatementSearchModel;
import com.nybsys.tillboxweb.models.purchase.SupplierInvoiceModel;
import com.nybsys.tillboxweb.models.purchase.SupplierModel;
import com.nybsys.tillboxweb.models.sales.CustomerInvoiceModel;
import com.nybsys.tillboxweb.models.sales.CustomerModel;
import com.nybsys.tillboxweb.models.sales.CustomerReturnModel;
import com.nybsys.tillboxweb.models.sales.VMCustomerReturn;
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
@RequestMapping(SalesModuleConstant.CUSTOMER_RETURN_BASE_URL)
@Api(tags = "Sales")
public class CustomerReturnController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_RETURN_SAVE_SERVICE_LINK_DESCRIPTION, response = VMCustomerReturn.class)
    @RequestMapping(value = SalesModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_RETURN_BASE_URL + SalesModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_RETURN__SEARCH_SERVICE_LINK_DESCRIPTION, response = CustomerReturnModel.class)
    @RequestMapping(value = SalesModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_RETURN_BASE_URL + SalesModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_RETURN__GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = CustomerReturnModel.class)
    @RequestMapping(value = SalesModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_RETURN_BASE_URL + SalesModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_STATEMENT_SERVICE_LINK_DESCRIPTION, response = StatementSearchModel.class)
    @RequestMapping(value = SalesModuleConstant.CUSTOMER_STATEMENT_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage customerStatement(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_RETURN_BASE_URL + SalesModuleConstant.CUSTOMER_STATEMENT_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = SalesModuleConstant.CUSTOMER_OUTSTANDING_SERVICE_LINK, response = CustomerModel.class)
    @RequestMapping(value = SalesModuleConstant.CUSTOMER_OUTSTANDING_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage customerOutstanding(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_RETURN_BASE_URL + SalesModuleConstant.CUSTOMER_OUTSTANDING_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = SalesModuleConstant.CUSTOMER_RETURN_DELETE_SERVICE_LINK_DESCRIPTION, response = CustomerReturnModel.class)
    @RequestMapping(value = SalesModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_RETURN_BASE_URL + SalesModuleConstant.DELETE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


}
