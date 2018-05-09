/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 14/02/2018
 * Time: 12:25
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.inventory;

public class PriceCategoryModel {

    private Integer priceCategoryID;
    private Integer businessID;
    private String name;
    private Boolean isDefault;

    public Integer getPriceCategoryID() {
        return priceCategoryID;
    }

    public void setPriceCategoryID(Integer priceCategoryID) {
        this.priceCategoryID = priceCategoryID;
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

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }
}
