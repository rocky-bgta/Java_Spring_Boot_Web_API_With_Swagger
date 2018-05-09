/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/14/2018
 * Time: 12:46 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.controllers.inventory;
import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.InventoryModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.accounting.AccountModel;
import com.nybsys.tillboxweb.models.inventory.ProductModel;
import com.nybsys.tillboxweb.models.inventory.VMProduct;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_INVENTORY_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_INVENTORY_MODULE_TOPIC;


@RestController
@RequestMapping(InventoryModuleConstant.PRODUCT_BASE_URL)
@Api(tags = "Inventory",value = InventoryModuleConstant.PRODUCT_CONTROLLER_NAME, description = InventoryModuleConstant.PRODUCT_CONTROLLER_DESCRIPTION)
public class ProductController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_SAVE_SERVICE_LINK_DESCRIPTION, response = VMProduct.class)
    @RequestMapping(value = InventoryModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.PRODUCT_BASE_URL+InventoryModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_TYPE_DELETE_SERVICE_LINK_DESCRIPTION, response = AccountModel.class)
    @RequestMapping(value = InventoryModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.PRODUCT_BASE_URL+InventoryModuleConstant.DELETE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_SEARCH_SERVICE_LINK_DESCRIPTION, response = ProductModel.class)
    @RequestMapping(value = InventoryModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.PRODUCT_BASE_URL+InventoryModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = InventoryModuleConstant.PRODUCT_LIKE_SEARCH_SERVICE_LINK_DESCRIPTION, response = ProductModel.class)
    @RequestMapping(value = InventoryModuleConstant.PRODUCT_LIKE_SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage likeSearch(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.PRODUCT_BASE_URL+InventoryModuleConstant.PRODUCT_LIKE_SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = InventoryModuleConstant.PRODUCT_SEARCH_WITH_STOCK_AND_PRICE_SERVICE_LINKK_DESCRIPTION, response = ProductModel.class)
    @RequestMapping(value = InventoryModuleConstant.PRODUCT_SEARCH_WITH_STOCK_AND_PRICE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage searchWithStockAndPrice(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.PRODUCT_BASE_URL+InventoryModuleConstant.PRODUCT_SEARCH_WITH_STOCK_AND_PRICE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = ProductModel.class)
    @RequestMapping(value = "getVMProduct", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getVMProduct(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage("api/product/getVMProduct", requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}



