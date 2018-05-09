/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 22/02/2018
 * Time: 02:25
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.common;


import java.util.Objects;

public class AddressTypeModel {
    private Integer addressTypeID;
    private String name;
    private Integer referenceType;

    public Integer getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(Integer addressTypeID) {
        this.addressTypeID = addressTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(Integer referenceType) {
        this.referenceType = referenceType;
    }
}
