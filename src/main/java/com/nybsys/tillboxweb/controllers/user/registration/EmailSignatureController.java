/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 19-Apr-18
 * Time: 12:48 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.controllers.user.registration;

import com.nybsys.tillboxweb.broker.client.MqttSubscribePublished;
import com.nybsys.tillboxweb.core.RequestMessage;
import com.nybsys.tillboxweb.core.ResponseMessage;
import com.nybsys.tillboxweb.models.user.registration.EmailSignatureModel;
import com.nybsys.tillboxweb.models.user.registration.RoundingModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.nybsys.tillboxweb.constant.ControllerSubscriptionConstants.WEB_API_USER_REGISTRATION_TOPIC;
import static com.nybsys.tillboxweb.constant.WorkerPublishedConstants.WORKER_USER_REGISTRATION_MODULE_TOPIC;


@RestController
@RequestMapping("api/emailSignature/")
@Api(tags = "User-Registration")
public class EmailSignatureController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = "EmailSignatureModel", response = EmailSignatureModel.class)
    @RequestMapping(value = "save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/emailSignature/save", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


    @ApiOperation(value = "EmailSignatureModel", response = EmailSignatureModel.class)
    @RequestMapping(value = "search", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            this.mqttSubscribePublished.setSubscriptionTopic(WEB_API_USER_REGISTRATION_TOPIC);
            this.mqttSubscribePublished.setPublishedTopic(WORKER_USER_REGISTRATION_MODULE_TOPIC);
            responseMessage = this.mqttSubscribePublished.getResponseMessage("api/emailSignature/search", requestMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }


}
    