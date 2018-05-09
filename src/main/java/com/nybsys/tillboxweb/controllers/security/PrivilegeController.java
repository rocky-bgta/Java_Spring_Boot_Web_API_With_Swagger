/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 29-Dec-17
 * Time: 2:47 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.controllers.security;
import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.constant.SecurityModuleConstant;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.security.PrivilegeModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_SECURITY_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_SECURITY_MODULE_TOPIC;

@RestController
@RequestMapping(SecurityModuleConstant.PRIVILEGE_BASE_URL)
@Api(tags = "Security",value = SecurityModuleConstant.PRIVILEGE_CONTROLLER_NAME, description = SecurityModuleConstant.PRIVILEGE_CONTROLLER_DESCRIPTION)
public class PrivilegeController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = SecurityModuleConstant.PRIVILEGE_SAVE_SERVICE_LINK_DESCRIPTION, response = PrivilegeModel.class)
    @RequestMapping(value = SecurityModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SECURITY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SECURITY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SecurityModuleConstant.PRIVILEGE_BASE_URL+SecurityModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SecurityModuleConstant.PRIVILEGE_GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = PrivilegeModel.class)
    @RequestMapping(value = SecurityModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SECURITY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SECURITY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SecurityModuleConstant.PRIVILEGE_BASE_URL+SecurityModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = SecurityModuleConstant.PRIVILEGE_GET_ALL_SERVICE_LINK_DESCRIPTION, response = PrivilegeModel.class)
    @RequestMapping(value = SecurityModuleConstant.GET_ALL_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_SECURITY_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_SECURITY_MODULE_TOPIC);
            responseMessage = mqttSubscribePublished.getResponseMessage(SecurityModuleConstant.PRIVILEGE_BASE_URL+SecurityModuleConstant.GET_ALL_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
