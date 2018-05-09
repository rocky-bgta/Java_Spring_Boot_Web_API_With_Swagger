/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 20-Feb-18
 * Time: 12:16 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.controllers.inventory;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.InventoryModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.inventory.ProductAdjustmentModel;
import com.nybsys.tillboxweb.models.inventory.VMProductAdjustment;
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
@RequestMapping(InventoryModuleConstant.PRODUCT_ADJUSTMENT_BASE_URL)
@Api(tags = "Inventory",description = "Author: Salahin")
public class ProductAdjustmentController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_ADJUSTMENT_SAVE_SERVICE_LINK_DESCRIPTION, response = VMProductAdjustment.class)
    @RequestMapping(value = InventoryModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.PRODUCT_ADJUSTMENT_BASE_URL+InventoryModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.PRODUCT_ADJUSTMENT_SEARCH_SERVICE_LINK_DESCRIPTION, response = ProductAdjustmentModel.class)
    @RequestMapping(value = InventoryModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.PRODUCT_ADJUSTMENT_BASE_URL+InventoryModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = InventoryModuleConstant.PRODUCT_ADJUSTMENT_DELETE_SERVICE_LINK_DESCRIPTION, response = ProductAdjustmentModel.class)
    @RequestMapping(value = InventoryModuleConstant.DELETE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.PRODUCT_ADJUSTMENT_BASE_URL+InventoryModuleConstant.DELETE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
