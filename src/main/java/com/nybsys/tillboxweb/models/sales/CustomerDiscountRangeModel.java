/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/03/2018
 * Time: 04:18
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;


import java.util.Objects;

public class CustomerDiscountRangeModel {
    private Integer customerDiscountRangeID;
    private Integer businessID;
    private Integer customerID;
    private Double rangeStart;
    private Double rangeEnd;
    private Boolean isPercent;
    private Double amount;

    public Integer getCustomerDiscountRangeID() {
        return customerDiscountRangeID;
    }

    public void setCustomerDiscountRangeID(Integer customerDiscountRangeID) {
        this.customerDiscountRangeID = customerDiscountRangeID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Double getRangeStart() {
        return rangeStart;
    }

    public void setRangeStart(Double rangeStart) {
        this.rangeStart = rangeStart;
    }

    public Double getRangeEnd() {
        return rangeEnd;
    }

    public void setRangeEnd(Double rangeEnd) {
        this.rangeEnd = rangeEnd;
    }

    public Boolean getPercent() {
        return isPercent;
    }

    public void setPercent(Boolean percent) {
        isPercent = percent;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
