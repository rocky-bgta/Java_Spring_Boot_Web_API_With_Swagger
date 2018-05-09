/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 13/02/2018
 * Time: 12:27
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.inventory;

public class AttributeProductMapperModel {

    private Integer attributeProductMapperID;
    private Integer businessID;
    private Integer productID;
    private Integer productAttributeID;
    private Integer productAttributeValueID;

    public Integer getAttributeProductMapperID() {
        return attributeProductMapperID;
    }

    public void setAttributeProductMapperID(Integer attributeProductMapperID) {
        this.attributeProductMapperID = attributeProductMapperID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Integer getProductAttributeID() {
        return productAttributeID;
    }

    public void setProductAttributeID(Integer productAttributeID) {
        this.productAttributeID = productAttributeID;
    }

    public Integer getProductAttributeValueID() {
        return productAttributeValueID;
    }

    public void setProductAttributeValueID(Integer productAttributeValueID) {
        this.productAttributeValueID = productAttributeValueID;
    }
}
