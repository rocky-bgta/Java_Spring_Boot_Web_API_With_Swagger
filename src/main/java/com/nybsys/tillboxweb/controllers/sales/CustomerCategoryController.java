/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 22/02/2018
 * Time: 04:45
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.controllers.sales;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.SalesModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.sales.CustomerCategoryModel;
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
@RequestMapping(SalesModuleConstant.CUSTOMER_CATEGORY_BASE_URL)
@Api(tags = "Sales",value  = SalesModuleConstant.CUSTOMER_CATEGORY_CONTROLLER_NAME,description = SalesModuleConstant.CUSTOMER_CATEGORY_CONTROLLER_DESCRIPTION)
public class CustomerCategoryController {
    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_CATEGORY_SAVE_SERVICE_LINK_DESCRIPTION, response = CustomerCategoryModel.class)
    @RequestMapping(value = SalesModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_CATEGORY_BASE_URL+SalesModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_CATEGORY_SEARCH_SERVICE_LINK_DESCRIPTION, response = CustomerCategoryModel.class)
    @RequestMapping(value = SalesModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_CATEGORY_BASE_URL+SalesModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SalesModuleConstant.CUSTOMER_CATEGORY_GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = CustomerCategoryModel.class)
    @RequestMapping(value = SalesModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SALES_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SALES_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SalesModuleConstant.CUSTOMER_CATEGORY_BASE_URL+SalesModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
}
