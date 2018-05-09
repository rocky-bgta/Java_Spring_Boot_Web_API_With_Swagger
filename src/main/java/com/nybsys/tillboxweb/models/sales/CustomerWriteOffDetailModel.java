/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 13/03/2018
 * Time: 4:52
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;


import java.util.Objects;

public class CustomerWriteOffDetailModel {
    private Integer customerWriteOffDetailID;
    private Integer customerWriteOffID;
    private Integer customerInvoiceID;
    private Double amount;

    public Integer getCustomerWriteOffDetailID() {
        return customerWriteOffDetailID;
    }

    public void setCustomerWriteOffDetailID(Integer customerWriteOffDetailID) {
        this.customerWriteOffDetailID = customerWriteOffDetailID;
    }

    public Integer getCustomerWriteOffID() {
        return customerWriteOffID;
    }

    public void setCustomerWriteOffID(Integer customerWriteOffID) {
        this.customerWriteOffID = customerWriteOffID;
    }

    public Integer getCustomerInvoiceID() {
        return customerInvoiceID;
    }

    public void setCustomerInvoiceID(Integer customerInvoiceID) {
        this.customerInvoiceID = customerInvoiceID;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
