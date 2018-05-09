/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 01-Mar-18
 * Time: 2:56 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.controllers.inventory;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.inventory.AdjustmentReferenceTypeModel;
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
@RequestMapping("/api/inventory/adjustmentReferenceType/")
@Api(tags = "Inventory", description = "Author: Salahin")
public class AdjustmentReferenceTypeController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = "AdjustmentReferenceType", response = AdjustmentReferenceTypeModel.class)
    @RequestMapping(value = "save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/inventory/adjustmentReferenceType/save", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = "AdjustmentReferenceType", response = AdjustmentReferenceTypeModel.class)
    @RequestMapping(value = "search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/inventory/adjustmentReferenceType/search", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "AdjustmentReferenceType", response = AdjustmentReferenceTypeModel.class)
    @RequestMapping(value = "delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/inventory/adjustmentReferenceType/delete", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "AdjustmentReferenceType", response = AdjustmentReferenceTypeModel.class)
    @RequestMapping(value = "inactive", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage inActive(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_INVENTORY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_INVENTORY_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/inventory/adjustmentReferenceType/inactive", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
}
    