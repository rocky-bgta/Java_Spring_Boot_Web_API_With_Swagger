/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 13-Mar-18
 * Time: 11:25 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.controllers.sales;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.sales.CustomerReceiveModel;
import com.nybsys.tillboxweb.models.sales.VMCustomerReceive;
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

//import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_COMMON_TOPIC;
//import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_COMMON_MODULE_TOPIC;

@RestController
@RequestMapping("/api/sales/customerReceive/")
@Api(tags = "Sales",description = "Author: Salahin")
public class CustomerReceiveController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = "CustomerReceive", response = VMCustomerReceive.class)
    @RequestMapping(value = "save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/sales/customerReceive/save", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = "CustomerReceive", response = CustomerReceiveModel.class)
    @RequestMapping(value = "search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/sales/customerReceive/search", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "CustomerReceive", response = CustomerReceiveModel.class)
    @RequestMapping(value = "getById", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getById(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/sales/customerReceive/getById", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "CustomerReceive", response = CustomerReceiveModel.class)
    @RequestMapping(value = "delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/sales/customerReceive/delete", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    /*
    
    @ApiOperation(value = "CustomerReceive", response = CustomerReceiveModel.class)
    @RequestMapping(value = "inactive", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage inActive(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            //this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            //this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/sales/customerReceive/inactive", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    
    */
}
    