/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 22/02/2018
 * Time: 04:45
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.controllers.purchase;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.PurchaseModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.purchase.SupplierTypeModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_PURCHASE_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_PURCHASE_MODULE_TOPIC;
@RestController
@RequestMapping(PurchaseModuleConstant.SUPPLIER_TYPE_BASE_URL)
@Api(tags = "Purchase", value = PurchaseModuleConstant.SUPPLIER_TYPE_CONTROLLER_NAME, description = PurchaseModuleConstant.SUPPLIER_TYPE_CONTROLLER_DESCRIPTION)
public class SupplierTypeController {
    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = PurchaseModuleConstant.SUPPLIER_TYPE_SAVE_SERVICE_LINK_DESCRIPTION, response = SupplierTypeModel.class)
    @RequestMapping(value = PurchaseModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(PurchaseModuleConstant.SUPPLIER_TYPE_BASE_URL + PurchaseModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = PurchaseModuleConstant.SUPPLIER_TYPE_SEARCH_SERVICE_LINK_DESCRIPTION, response = SupplierTypeModel.class)
    @RequestMapping(value = PurchaseModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(PurchaseModuleConstant.SUPPLIER_TYPE_BASE_URL + PurchaseModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = PurchaseModuleConstant.SUPPLIER_TYPE_GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = SupplierTypeModel.class)
    @RequestMapping(value = PurchaseModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(PurchaseModuleConstant.SUPPLIER_TYPE_BASE_URL + PurchaseModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = PurchaseModuleConstant.SUPPLIER_TYPE_DELETE_SERVICE_LINK_DESCRIPTION, response = SupplierTypeModel.class)
    @RequestMapping(value = PurchaseModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(PurchaseModuleConstant.SUPPLIER_TYPE_BASE_URL + PurchaseModuleConstant.DELETE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
}
