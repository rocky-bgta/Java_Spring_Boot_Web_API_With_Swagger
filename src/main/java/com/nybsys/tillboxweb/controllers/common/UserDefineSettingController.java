/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 29-Dec-17
 * Time: 2:47 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */
package com.nybsys.tillboxweb.controllers.common;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.common.UserDefineSettingModel;
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

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/api/commonModule/userDefineSetting/")
@Api(tags = "Common",description = "Author: Salahin")
public class UserDefineSettingController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = "User Define Setting", response = UserDefineSettingModel.class)
    @RequestMapping(value = "save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage saveOrUpdate(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/commonModule/userDefineSetting/save", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "User Define Setting", response = UserDefineSettingModel.class)
    @RequestMapping(value = "getAll", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getAll(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/commonModule/userDefineSetting/getAll", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "User Define Setting", response = UserDefineSettingModel.class)
    @RequestMapping(value = "search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByConditions(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/commonModule/userDefineSetting/search", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "User Define Setting", response = UserDefineSettingModel.class)
    @RequestMapping(value = "getByID", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/commonModule/userDefineSetting/getByID", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

    @ApiOperation(value = "User Define Setting", response = UserDefineSettingModel.class)
    @RequestMapping(value = "delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage delete(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_COMMON_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_COMMON_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/commonModule/userDefineSetting/delete", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
