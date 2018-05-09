package com.nybsys.tillboxweb.models.user.registration;

import java.util.Date;
import java.util.Objects;

public class FinancialYearModel {
    private Integer financialYearID;
    private String financialYearName;
    private Integer businessID;
    private Date startDate;
    private Date endDate;
    private Date lockMyDataAt;
    private Boolean lockData;
    private Boolean isCurrentFinancialYear;

    public Integer getFinancialYearID() {
        return financialYearID;
    }

    public void setFinancialYearID(Integer financialYearID) {
        this.financialYearID = financialYearID;
    }

    public String getFinancialYearName() {
        return financialYearName;
    }

    public void setFinancialYearName(String financialYearName) {
        this.financialYearName = financialYearName;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getLockMyDataAt() {
        return lockMyDataAt;
    }

    public void setLockMyDataAt(Date lockMyDataAt) {
        this.lockMyDataAt = lockMyDataAt;
    }

    public Boolean getIsCurrentFinancialYear() {
        return isCurrentFinancialYear;
    }

    public void setIsCurrentFinancialYear(Boolean isCurrentFinancialYear) {
        this.isCurrentFinancialYear = isCurrentFinancialYear;
    }

    public Boolean getLockData() {
        return lockData;
    }

    public void setLockData(Boolean lockData) {
        this.lockData = lockData;
    }
}
