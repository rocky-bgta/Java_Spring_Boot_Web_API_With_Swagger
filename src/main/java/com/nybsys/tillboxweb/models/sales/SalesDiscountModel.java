/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/03/2018
 * Time: 03:45
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;

import java.util.Objects;

public class SalesDiscountModel  {
    private Integer salesDiscountID;
    private Integer businessID;
    private Integer salesOrderID;
    private Integer referenceType;
    private Integer referenceID;

    public Integer getSalesDiscountID() {
        return salesDiscountID;
    }

    public void setSalesDiscountID(Integer salesDiscountID) {
        this.salesDiscountID = salesDiscountID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getSalesOrderID() {
        return salesOrderID;
    }

    public void setSalesOrderID(Integer salesOrderID) {
        this.salesOrderID = salesOrderID;
    }

    public Integer getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(Integer referenceType) {
        this.referenceType = referenceType;
    }

    public Integer getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(Integer referenceID) {
        this.referenceID = referenceID;
    }
}
