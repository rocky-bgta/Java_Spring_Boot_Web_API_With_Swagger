package com.nybsys.tillboxweb.models.user.registration;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class BusinessTypeModel extends BaseModel {
    private Integer businessTypeID;

    @Override
    public String toString() {
        return "BusinessTypeModel{" +
                "businessTypeID=" + businessTypeID +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessTypeModel)) return false;
        BusinessTypeModel that = (BusinessTypeModel) o;
        return Objects.equals(businessTypeID, that.businessTypeID) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessTypeID, value);
    }

    private String value;

}
