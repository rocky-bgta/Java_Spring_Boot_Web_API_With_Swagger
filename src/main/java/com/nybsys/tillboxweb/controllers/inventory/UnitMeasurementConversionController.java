/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/02/2018
 * Time: 02:46
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.controllers.inventory;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.InventoryModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.inventory.UnitMeasurementConversionModel;
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
@RequestMapping(InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_BASE_URL)
@Api(tags = "Inventory",value = InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_CONTROLLER_NAME, description = InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_CONTROLLER_DESCRIPTION)
public class UnitMeasurementConversionController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_SAVE_SERVICE_LINK_DESCRIPTION, response = UnitMeasurementConversionModel.class)
    @RequestMapping(value = InventoryModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_BASE_URL+InventoryModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_SEARCH_SERVICE_LINK_DESCRIPTION, response = UnitMeasurementConversionModel.class)
    @RequestMapping(value = InventoryModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_BASE_URL+InventoryModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_INACTIVE_SERVICE_LINK_DESCRIPTION, response = UnitMeasurementConversionModel.class)
    @RequestMapping(value = InventoryModuleConstant.INACTIVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage inactive(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(InventoryModuleConstant.UNIT_MEASUREMENT_CONVERSION_BASE_URL+InventoryModuleConstant.INACTIVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}

