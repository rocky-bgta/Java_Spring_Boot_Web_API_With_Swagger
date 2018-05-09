package com.nybsys.tillboxweb.models.accounting;


import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class BudgetModel extends BaseModel {
    private Integer budgetID;
    private Integer businessID;
    private Integer financialYearID;

    public Integer getBudgetID() {
        return budgetID;
    }

    public void setBudgetID(Integer budgetID) {
        this.budgetID = budgetID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getFinancialYearID() {
        return financialYearID;
    }

    public void setFinancialYearID(Integer financialYearID) {
        this.financialYearID = financialYearID;
    }

}
