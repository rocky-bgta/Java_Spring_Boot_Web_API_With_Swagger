package com.nybsys.tillboxweb.models.security;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class PrivilegeModel extends BaseModel {

    private Integer privilegeID;
    private Integer parentID;
    private String name;
    private String actionCode;
    private String showName;

    public Integer getPrivilegeID() {
        return privilegeID;
    }

    public void setPrivilegeID(Integer privilegeID) {
        this.privilegeID = privilegeID;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }
}
