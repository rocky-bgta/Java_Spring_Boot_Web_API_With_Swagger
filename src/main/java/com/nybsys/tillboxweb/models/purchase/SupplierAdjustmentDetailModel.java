/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 22/02/2018
 * Time: 11:24
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.purchase;

import java.util.Objects;

public class SupplierAdjustmentDetailModel  {
    private Integer supplierAdjustmentDetailID;
    private Integer supplierAdjustmentID;
    private Integer supplierInvoiceID;
    private Double adjustAmount;

    public Integer getSupplierAdjustmentDetailID() {
        return supplierAdjustmentDetailID;
    }

    public void setSupplierAdjustmentDetailID(Integer supplierAdjustmentDetailID) {
        this.supplierAdjustmentDetailID = supplierAdjustmentDetailID;
    }

    public Integer getSupplierAdjustmentID() {
        return supplierAdjustmentID;
    }

    public void setSupplierAdjustmentID(Integer supplierAdjustmentID) {
        this.supplierAdjustmentID = supplierAdjustmentID;
    }

    public Integer getSupplierInvoiceID() {
        return supplierInvoiceID;
    }

    public void setSupplierInvoiceID(Integer supplierInvoiceID) {
        this.supplierInvoiceID = supplierInvoiceID;
    }

    public Double getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(Double adjustAmount) {
        this.adjustAmount = adjustAmount;
    }
}
