/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/03/2018
 * Time: 02:56
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.purchase;


import com.nybsys.tillboxweb.core.BaseModelWithCurrency;

import java.util.Date;

public class SupplierAdditionalCostModel extends BaseModelWithCurrency {
    private Integer supplierAdditionalCostID;
    private Integer businessID;
    private Integer supplierAdditionalCostSettingID;
    private Integer referenceID;
    private Integer partyType;
    private Integer partyID;
    private Date dueDate;
    private String description;
    private Integer vatID;
    private Integer amount;

    public Integer getSupplierAdditionalCostID() {
        return supplierAdditionalCostID;
    }

    public void setSupplierAdditionalCostID(Integer supplierAdditionalCostID) {
        this.supplierAdditionalCostID = supplierAdditionalCostID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getSupplierAdditionalCostSettingID() {
        return supplierAdditionalCostSettingID;
    }

    public void setSupplierAdditionalCostSettingID(Integer supplierAdditionalCostSettingID) {
        this.supplierAdditionalCostSettingID = supplierAdditionalCostSettingID;
    }

    public Integer getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(Integer referenceID) {
        this.referenceID = referenceID;
    }

    public Integer getPartyType() {
        return partyType;
    }

    public void setPartyType(Integer partyType) {
        this.partyType = partyType;
    }

    public Integer getPartyID() {
        return partyID;
    }

    public void setPartyID(Integer partyID) {
        this.partyID = partyID;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVatID() {
        return vatID;
    }

    public void setVatID(Integer vatID) {
        this.vatID = vatID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
