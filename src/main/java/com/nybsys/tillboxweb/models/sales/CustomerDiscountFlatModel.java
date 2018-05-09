/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/03/2018
 * Time: 04:14
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;


import java.util.Objects;

public class CustomerDiscountFlatModel  {
    private Integer customerDiscountFlatID;
    private Integer businessID;
    private Integer customerID;
    private Double percentAmount;

    public Integer getCustomerDiscountFlatID() {
        return customerDiscountFlatID;
    }

    public void setCustomerDiscountFlatID(Integer customerDiscountFlatID) {
        this.customerDiscountFlatID = customerDiscountFlatID;
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

    public Double getPercentAmount() {
        return percentAmount;
    }

    public void setPercentAmount(Double percentAmount) {
        this.percentAmount = percentAmount;
    }

}
