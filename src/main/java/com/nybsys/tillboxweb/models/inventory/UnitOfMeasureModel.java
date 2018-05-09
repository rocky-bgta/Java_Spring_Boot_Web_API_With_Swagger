/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 13/02/2018
 * Time: 12:16
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.inventory;

public class UnitOfMeasureModel {

    private Integer unitOfMeasureID;
    private Integer uOMMethodID;
    private Integer businessID;
    private String name;

    public Integer getUnitOfMeasureID() {
        return unitOfMeasureID;
    }

    public void setUnitOfMeasureID(Integer unitOfMeasureID) {
        this.unitOfMeasureID = unitOfMeasureID;
    }

    public Integer getuOMMethodID() {
        return uOMMethodID;
    }

    public void setuOMMethodID(Integer uOMMethodID) {
        this.uOMMethodID = uOMMethodID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
