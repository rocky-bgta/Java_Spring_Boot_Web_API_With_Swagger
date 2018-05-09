package com.nybsys.tillboxweb.models.security;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class AccessRightRoleMappingModel extends BaseModel {

    private Integer accessRightRoleMappingID;

    private Integer accessRightID;

    private Integer roleID;

    public Integer getAccessRightRoleMappingID() {
        return accessRightRoleMappingID;
    }

    public void setAccessRightRoleMappingID(Integer accessRightRoleMappingID) {
        this.accessRightRoleMappingID = accessRightRoleMappingID;
    }

    public Integer getAccessRightID() {
        return accessRightID;
    }

    public void setAccessRightID(Integer accessRightID) {
        this.accessRightID = accessRightID;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

}
