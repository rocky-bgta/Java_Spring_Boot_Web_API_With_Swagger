/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 13/02/2018
 * Time: 10:54
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.inventory;

public class ProductAttributeValueModel {

    private Integer productAttributeValueID;
    private Integer businessID;
    private Integer productAttributeID;
    private String value;

    public Integer getProductAttributeValueID() {
        return productAttributeValueID;
    }

    public void setProductAttributeValueID(Integer productAttributeValueID) {
        this.productAttributeValueID = productAttributeValueID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getProductAttributeID() {
        return productAttributeID;
    }

    public void setProductAttributeID(Integer productAttributeID) {
        this.productAttributeID = productAttributeID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
