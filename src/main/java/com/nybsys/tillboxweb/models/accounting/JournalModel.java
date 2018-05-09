package com.nybsys.tillboxweb.models.accounting;

import com.nybsys.tillboxweb.core.BaseModel;
import com.nybsys.tillboxweb.core.BaseModelWithCurrency;

import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

public class JournalModel  extends BaseModelWithCurrency {

    private BigInteger journalID;
    private Integer businessID;
    private Integer journalReferenceNo;
    private Integer financialYearID;
    private Date date;
    private Integer period;
    private Integer accountID;
    private Double amount;
    private Integer drCrIndicator;
    private Integer referenceID;
    private Integer referenceType;
    private Integer partyID;
    private Integer partyType;

    public Integer getPartyID() {
        return partyID;
    }

    public void setPartyID(Integer partyID) {
        this.partyID = partyID;
    }

    public Integer getPartyType() {
        return partyType;
    }

    public void setPartyType(Integer partyType) {
        this.partyType = partyType;
    }

    private Integer note;

    public BigInteger getJournalID() {
        return journalID;
    }

    public void setJournalID(BigInteger journalID) {
        this.journalID = journalID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getJournalReferenceNo() {
        return journalReferenceNo;
    }

    public void setJournalReferenceNo(Integer journalReferenceNo) {
        this.journalReferenceNo = journalReferenceNo;
    }

    public Integer getFinancialYearID() {
        return financialYearID;
    }

    public void setFinancialYearID(Integer financialYearID) {
        this.financialYearID = financialYearID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getDrCrIndicator() {
        return drCrIndicator;
    }

    public void setDrCrIndicator(Integer drCrIndicator) {
        this.drCrIndicator = drCrIndicator;
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

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }
}
