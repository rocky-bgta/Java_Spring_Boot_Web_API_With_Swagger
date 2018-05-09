package com.nybsys.tillboxweb.models.accounting;

import com.nybsys.tillboxweb.core.BaseModel;
import org.omg.CORBA.INTERNAL;

import java.util.Objects;

public class AccountModel extends BaseModel {

    private Integer accountID;
    private Integer businessID;
    private Integer accountCode;
    private String accountName;
    private Integer accountClassificationID;
    private Integer accountTypeID;
    private Integer parentAccountID;
    private Integer taxCodeID;
    private Integer cashFlowID;
    private Boolean isDefault;
    private Integer status;

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

    public Integer getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(Integer accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getAccountClassificationID() {
        return accountClassificationID;
    }

    public void setAccountClassificationID(Integer accountClassificationID) {
        this.accountClassificationID = accountClassificationID;
    }

    public Integer getAccountTypeID() {
        return accountTypeID;
    }

    public void setAccountTypeID(Integer accountTypeID) {
        this.accountTypeID = accountTypeID;
    }

    public Integer getParentAccountID() {
        return parentAccountID;
    }

    public void setParentAccountID(Integer parentAccountID) {
        this.parentAccountID = parentAccountID;
    }

    public Integer getTaxCodeID() {
        return taxCodeID;
    }

    public void setTaxCodeID(Integer taxCodeID) {
        this.taxCodeID = taxCodeID;
    }

    public Integer getCashFlowID() {
        return cashFlowID;
    }

    public void setCashFlowID(Integer cashFlowID) {
        this.cashFlowID = cashFlowID;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public Integer getStatus() {
        return status;
    }

    @Override
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountModel)) return false;
        if (!super.equals(o)) return false;
        AccountModel that = (AccountModel) o;
        return Objects.equals(getAccountID(), that.getAccountID()) &&
                Objects.equals(getBusinessID(), that.getBusinessID()) &&
                Objects.equals(getAccountCode(), that.getAccountCode()) &&
                Objects.equals(getAccountName(), that.getAccountName()) &&
                Objects.equals(getAccountClassificationID(), that.getAccountClassificationID()) &&
                Objects.equals(getAccountTypeID(), that.getAccountTypeID()) &&
                Objects.equals(getParentAccountID(), that.getParentAccountID()) &&
                Objects.equals(getTaxCodeID(), that.getTaxCodeID()) &&
                Objects.equals(getCashFlowID(), that.getCashFlowID()) &&
                Objects.equals(isDefault, that.isDefault) &&
                Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAccountID(), getBusinessID(), getAccountCode(), getAccountName(), getAccountClassificationID(), getAccountTypeID(), getParentAccountID(), getTaxCodeID(), getCashFlowID(), isDefault, getStatus());
    }

    @Override
    public String toString() {
        return "AccountModel{" +
                "accountID=" + accountID +
                ", businessID=" + businessID +
                ", accountCode=" + accountCode +
                ", accountName='" + accountName + '\'' +
                ", accountClassificationID=" + accountClassificationID +
                ", accountTypeID=" + accountTypeID +
                ", parentAccountID=" + parentAccountID +
                ", taxCodeID=" + taxCodeID +
                ", cashFlowID=" + cashFlowID +
                ", isDefault=" + isDefault +
                ", status=" + status +
                '}';
    }
}
