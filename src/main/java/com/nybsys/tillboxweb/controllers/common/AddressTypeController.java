/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 22/02/2018
 * Time: 04:44
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.controllers.common;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.CommonModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.common.AddressTypeModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_COMMON_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_COMMON_MODULE_TOPIC;

@RestController
@RequestMapping(CommonModuleConstant.ADDRESS_TYPE_BASE_URL)
@Api(tags = "Common",value  = CommonModuleConstant.ADDRESS_TYPE_CONTROLLER_NAME,description = CommonModuleConstant.ADDRESS_TYPE_CONTROLLER_DESCRIPTION)
public class AddressTypeController {
    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = CommonModuleConstant.ADDRESS_TYPE_SAVE_SERVICE_LINK_DESCRIPTION, response = AddressTypeModel.class)
    @RequestMapping(value = CommonModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(CommonModuleConstant.ADDRESS_TYPE_BASE_URL+CommonModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = CommonModuleConstant.ADDRESS_TYPE_SEARCH_SERVICE_LINK_DESCRIPTION, response = AddressTypeModel.class)
    @RequestMapping(value = CommonModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(CommonModuleConstant.ADDRESS_TYPE_BASE_URL+CommonModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = CommonModuleConstant.ADDRESS_TYPE_GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = AddressTypeModel.class)
    @RequestMapping(value = CommonModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(CommonModuleConstant.ADDRESS_TYPE_BASE_URL+CommonModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
}
