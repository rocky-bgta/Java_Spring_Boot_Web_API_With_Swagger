package com.nybsys.tillboxweb.models.security;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class PrivilegeMappingModel extends BaseModel {
    private Integer privilegeServiceMappingID;
    private Integer privilegeID;
    private String serviceURI;

    @Override
    public String toString() {
        return "PrivilegeMappingModel{" +
                "privilegeServiceMappingID=" + privilegeServiceMappingID +
                ", privilegeID=" + privilegeID +
                ", serviceURI='" + serviceURI + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrivilegeMappingModel)) return false;
        PrivilegeMappingModel that = (PrivilegeMappingModel) o;
        return Objects.equals(privilegeServiceMappingID, that.privilegeServiceMappingID) &&
                Objects.equals(privilegeID, that.privilegeID) &&
                Objects.equals(serviceURI, that.serviceURI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privilegeServiceMappingID, privilegeID, serviceURI);
    }
}
