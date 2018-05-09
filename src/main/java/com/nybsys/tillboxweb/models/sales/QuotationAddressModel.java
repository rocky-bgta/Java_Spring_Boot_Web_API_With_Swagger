/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/03/2018
 * Time: 04:02
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;


import java.util.Objects;

public class QuotationAddressModel {
    private Integer quotationAddressID;
    private Integer businessID;
    private Integer customerAddressTypeID;
    private Integer customerQuotationID;
    private Integer customerAddressID;

    public Integer getQuotationAddressID() {
        return quotationAddressID;
    }

    public void setQuotationAddressID(Integer quotationAddressID) {
        this.quotationAddressID = quotationAddressID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getCustomerAddressTypeID() {
        return customerAddressTypeID;
    }

    public void setCustomerAddressTypeID(Integer customerAddressTypeID) {
        this.customerAddressTypeID = customerAddressTypeID;
    }

    public Integer getCustomerQuotationID() {
        return customerQuotationID;
    }

    public void setCustomerQuotationID(Integer customerQuotationID) {
        this.customerQuotationID = customerQuotationID;
    }

    public Integer getCustomerAddressID() {
        return customerAddressID;
    }

    public void setCustomerAddressID(Integer customerAddressID) {
        this.customerAddressID = customerAddressID;
    }

}
