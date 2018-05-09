/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 13/03/2018
 * Time: 4:46
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;

public class CustomerAdjustmentDetailModel {
    private Integer customerAdjustmentDetailID;
    private Integer customerAdjustmentID;
    private Integer customerInvoiceID;
    private Double adjustAmount;

    public Integer getCustomerAdjustmentDetailID() {
        return customerAdjustmentDetailID;
    }

    public void setCustomerAdjustmentDetailID(Integer customerAdjustmentDetailID) {
        this.customerAdjustmentDetailID = customerAdjustmentDetailID;
    }

    public Integer getCustomerAdjustmentID() {
        return customerAdjustmentID;
    }

    public void setCustomerAdjustmentID(Integer customerAdjustmentID) {
        this.customerAdjustmentID = customerAdjustmentID;
    }

    public Integer getCustomerInvoiceID() {
        return customerInvoiceID;
    }

    public void setCustomerInvoiceID(Integer customerInvoiceID) {
        this.customerInvoiceID = customerInvoiceID;
    }

    public Double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }
}
