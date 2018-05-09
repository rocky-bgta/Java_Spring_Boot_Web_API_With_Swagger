/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 28-Feb-18
 * Time: 3:19 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.controllers.purchase;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.purchase.SupplierPaymentModel;
import com.nybsys.tillboxweb.models.purchase.VMSupplierPaymentModel;
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
@RequestMapping("/api/purchase/supplierPayment/")
@Api(description = "Author: Salahin", tags = "Purchase")
public class SupplierPaymentController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = "SupplierPayment", response = VMSupplierPaymentModel.class)
    @RequestMapping(value = "save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/purchase/supplierPayment/save", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = "SupplierPayment", response = SupplierPaymentModel.class)
    @RequestMapping(value = "search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/purchase/supplierPayment/search", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = "SupplierPayment", response = SupplierPaymentModel.class)
    @RequestMapping(value = "getById", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getById(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/purchase/supplierPayment/getById", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "SupplierPayment", response = SupplierPaymentModel.class)
    @RequestMapping(value = "delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/purchase/supplierPayment/delete", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

   /* @ApiOperation(value = "SupplierPayment", response = VMSupplierPaymentModel.class)
    @RequestMapping(value = "inactive", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage inActive(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_PURCHASE_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_PURCHASE_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/purchase/supplierPayment/inactive", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }*/
}
    