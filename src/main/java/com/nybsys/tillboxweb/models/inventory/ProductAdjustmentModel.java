/**
 * Created By: Md. Nazmus Salahin
 * Created Date: 19-Feb-18
 * Time: 4:21 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight Nybsys ltd.
 */

package com.nybsys.tillboxweb.models.inventory;

import com.nybsys.tillboxweb.core.BaseModelWithCurrency;

import java.util.Date;
import java.util.Objects;

public class ProductAdjustmentModel extends BaseModelWithCurrency{


    private Integer productAdjustmentID;
    private Integer adjustmentType;
    private Integer businessID;
    private Date date;
    private Double totalPrice;
    private Boolean isApproved;
    private Boolean approvedBy;
    private String reason;
    private Integer productAdjustmentReferenceTypeID;

    public Integer getProductAdjustmentID() {
        return productAdjustmentID;
    }

    public void setProductAdjustmentID(Integer productAdjustmentID) {
        this.productAdjustmentID = productAdjustmentID;
    }

    public Integer getAdjustmentType() {
        return adjustmentType;
    }

    public void setAdjustmentType(Integer adjustmentType) {
        this.adjustmentType = adjustmentType;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Boolean getApproved() {
        return isApproved;
    }

    public void setApproved(Boolean approved) {
        isApproved = approved;
    }

    public Boolean getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Boolean approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getProductAdjustmentReferenceTypeID() {
        return productAdjustmentReferenceTypeID;
    }

    public void setProductAdjustmentReferenceTypeID(Integer productAdjustmentReferenceTypeID) {
        this.productAdjustmentReferenceTypeID = productAdjustmentReferenceTypeID;
    }
}
