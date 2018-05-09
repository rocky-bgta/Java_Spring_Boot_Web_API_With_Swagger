package com.nybsys.tillboxweb.models.accounting;


import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class BudgetDetailModel extends BaseModel {
    private Integer budgetDetailID;
    private Integer budgetID;
    private Integer accountTypeID;
    private Integer accountID;
    private Integer period;
    private Float amount;

    public Integer getBudgetDetailID() {
        return budgetDetailID;
    }

    public void setBudgetDetailID(Integer budgetDetailID) {
        this.budgetDetailID = budgetDetailID;
    }

    public Integer getBudgetID() {
        return budgetID;
    }

    public void setBudgetID(Integer budgetID) {
        this.budgetID = budgetID;
    }

    public Integer getAccountTypeID() {
        return accountTypeID;
    }

    public void setAccountTypeID(Integer accountTypeID) {
        this.accountTypeID = accountTypeID;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

}
