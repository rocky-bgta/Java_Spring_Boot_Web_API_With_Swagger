package com.nybsys.tillboxweb.models.security;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class RolePrivilegeMappingModel extends BaseModel {
    private Integer rolePrivilegeMappingID;
    private Integer roleID;
    private Integer privilegeID;

    @Override
    public String toString() {
        return "RolePrivilegeMappingModel{" +
                "rolePrivilegeMappingID=" + rolePrivilegeMappingID +
                ", roleID=" + roleID +
                ", privilegeID=" + privilegeID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RolePrivilegeMappingModel)) return false;
        RolePrivilegeMappingModel that = (RolePrivilegeMappingModel) o;
        return Objects.equals(rolePrivilegeMappingID, that.rolePrivilegeMappingID) &&
                Objects.equals(roleID, that.roleID) &&
                Objects.equals(privilegeID, that.privilegeID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rolePrivilegeMappingID, roleID, privilegeID);
    }
}
