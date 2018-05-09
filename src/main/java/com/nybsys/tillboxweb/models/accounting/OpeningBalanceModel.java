package com.nybsys.tillboxweb.models.accounting;

import com.nybsys.tillboxweb.core.BaseModel;
import com.nybsys.tillboxweb.core.BaseModelWithCurrency;

import java.util.Date;
import java.util.Objects;

public class OpeningBalanceModel  extends BaseModelWithCurrency {

    private Integer openingBalanceID;
    private Integer accountID;
    private Integer businessID;
    private Double amount;
    private Date date;
    private String note;
    private Integer referenceID;
    private Integer referenceType;

    public Integer getOpeningBalanceID() {
        return openingBalanceID;
    }

    public void setOpeningBalanceID(Integer openingBalanceID) {
        this.openingBalanceID = openingBalanceID;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getReferenceID() {
        return referenceID;
    }

    public void setReferenceID(Integer referenceID) {
        this.referenceID = referenceID;
    }

    public Integer getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(Integer referenceType) {
        this.referenceType = referenceType;
    }
}
