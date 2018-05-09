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
import com.nybsys.tillboxweb.models.security.PrivilegeMappingModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(SecurityModuleConstant.PRIVILEGE_MAPPING_BASE_URL)
@Api(tags = "Security",value = SecurityModuleConstant.PRIVILEGE_MAPPING_CONTROLLER_NAME, description = SecurityModuleConstant.PRIVILEGE_MAPPING_CONTROLLER_DESCRIPTION)
public class PrivilegeMappingController {

    @Autowired
    MqttSubscribePublished mqttSubscribePublished;

    @ApiOperation(value = SecurityModuleConstant.PRIVILEGE_MAPPING_SAVE_SERVICE_LINK_DESCRIPTION, response = PrivilegeMappingModel.class)
    @RequestMapping(value = SecurityModuleConstant.SAVE_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage save(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            responseMessage = mqttSubscribePublished.getResponseMessage(SecurityModuleConstant.PRIVILEGE_MAPPING_BASE_URL+SecurityModuleConstant.SAVE_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = SecurityModuleConstant.PRIVILEGE_MAPPING_GET_BY_ID_SERVICE_LINK_DESCRIPTION, response = PrivilegeMappingModel.class)
    @RequestMapping(value = SecurityModuleConstant.GET_BY_ID_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage getByID(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            responseMessage = mqttSubscribePublished.getResponseMessage(SecurityModuleConstant.PRIVILEGE_MAPPING_BASE_URL+SecurityModuleConstant.GET_BY_ID_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }
    @ApiOperation(value = SecurityModuleConstant.PRIVILEGE_MAPPING_SEARCH_SERVICE_LINK_DESCRIPTION, response = PrivilegeMappingModel.class)
    @RequestMapping(value = SecurityModuleConstant.SEARCH_SERVICE_LINK, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseMessage search(@RequestBody RequestMessage requestMessage) throws MqttException {
        ResponseMessage responseMessage = null;
        try {
            responseMessage = mqttSubscribePublished.getResponseMessage(SecurityModuleConstant.PRIVILEGE_MAPPING_BASE_URL+SecurityModuleConstant.SEARCH_SERVICE_LINK, requestMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseMessage;
    }

}
