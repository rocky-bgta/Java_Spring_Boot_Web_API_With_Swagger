/**
 * Created By: Md. Abdul Hannan
 * Created Date: 3/1/2018
 * Time: 11:10 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.controllers.inventory;


import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.InventoryModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.inventory.ProductModel;
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
@RequestMapping(InventoryModuleConstant.INVENTORY_TRANSACTION_BASE_URL)
@Api(tags = "Inventory",value = InventoryModuleConstant.INVENTORY_TRANSACTION_CONTROLLER_NAME, description = InventoryModuleConstant.PRODUCT_CONTROLLER_DESCRIPTION)
public class InventoryTransactionController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = InventoryModuleConstant.INVENTORY_TRANSACTION_SEARCH_SERVICE_LINK_DESCRIPTION, response = ProductModel.class)
    @RequestMapping(value = InventoryModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.INVENTORY_TRANSACTION_BASE_URL + InventoryModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
