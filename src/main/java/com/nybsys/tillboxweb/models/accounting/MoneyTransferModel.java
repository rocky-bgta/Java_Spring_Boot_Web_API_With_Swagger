package com.nybsys.tillboxweb.models.accounting;


import com.nybsys.tillboxweb.core.BaseModel;
import com.nybsys.tillboxweb.core.BaseModelWithCurrency;

import java.util.Date;
import java.util.Objects;

public class MoneyTransferModel extends BaseModelWithCurrency {

    private Integer moneyTransferID;
    private Integer businessID;
    private String trackingNo;
    private String docNumber;
    private Date date;
    private Double amount;
    private Integer accountIDTo;
    private Integer accountIDFrom;
    private String note;

    public Integer getMoneyTransferID() {
        return moneyTransferID;
    }

    public void setMoneyTransferID(Integer moneyTransferID) {
        this.moneyTransferID = moneyTransferID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public String getTrackingNo() {
        return trackingNo;
    }

    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getAccountIDTo() {
        return accountIDTo;
    }

    public void setAccountIDTo(Integer accountIDTo) {
        this.accountIDTo = accountIDTo;
    }

    public Integer getAccountIDFrom() {
        return accountIDFrom;
    }

    public void setAccountIDFrom(Integer accountIDFrom) {
        this.accountIDFrom = accountIDFrom;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
