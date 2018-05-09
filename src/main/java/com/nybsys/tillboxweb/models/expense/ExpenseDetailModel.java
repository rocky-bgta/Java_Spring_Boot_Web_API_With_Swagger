/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 27/03/2018
 * Time: 04:32
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.expense;


import java.util.Date;
import java.util.Objects;

public class ExpenseDetailModel {
    private Integer expenseDetailID;
    private Integer expenseID;
    private String accountNumber;
    private Double amount;
    private String note;
    private Integer accountIDFrom;
    private Date endDate;
    private Integer accountIDExpense;
    private Integer expenseTypeID;
    private Date effectiveDate;
    //private Byte attachment;
    private Integer paymentMethod;
    private String referenceNumber;

    public Integer getExpenseDetailID() {
        return expenseDetailID;
    }

    public void setExpenseDetailID(Integer expenseDetailID) {
        this.expenseDetailID = expenseDetailID;
    }

    public Integer getExpenseID() {
        return expenseID;
    }

    public void setExpenseID(Integer expenseID) {
        this.expenseID = expenseID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getAccountIDFrom() {
        return accountIDFrom;
    }

    public void setAccountIDFrom(Integer accountIDFrom) {
        this.accountIDFrom = accountIDFrom;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getAccountIDExpense() {
        return accountIDExpense;
    }

    public void setAccountIDExpense(Integer accountIDExpense) {
        this.accountIDExpense = accountIDExpense;
    }

    public Integer getExpenseTypeID() {
        return expenseTypeID;
    }

    public void setExpenseTypeID(Integer expenseTypeID) {
        this.expenseTypeID = expenseTypeID;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Integer getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Integer paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

}
