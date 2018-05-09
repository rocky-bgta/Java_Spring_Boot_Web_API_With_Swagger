package com.nybsys.tillboxweb.models.user.registration;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Date;
import java.util.Objects;

public class BusinessDetailsModel extends BaseModel{
    private Integer businessDetailsID;
    private Integer businessID;
    private Integer financialYearID;
    private String tradingName;
    private String abnacn;
    private String abnBranch;
    private boolean taxPaymentsReporting;
    private String emailAddress;
    private String phone;
    private String fax;
    private String website;
    private Date openingBalanceDate;
    private Date lockmyDataAt;

    public Integer getBusinessDetailsID() {
        return businessDetailsID;
    }

    public void setBusinessDetailsID(Integer businessDetailsID) {
        this.businessDetailsID = businessDetailsID;
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

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public String getAbnacn() {
        return abnacn;
    }

    public void setAbnacn(String abnacn) {
        this.abnacn = abnacn;
    }

    public String getAbnBranch() {
        return abnBranch;
    }

    public void setAbnBranch(String abnBranch) {
        this.abnBranch = abnBranch;
    }

    public boolean isTaxPaymentsReporting() {
        return taxPaymentsReporting;
    }

    public void setTaxPaymentsReporting(boolean taxPaymentsReporting) {
        this.taxPaymentsReporting = taxPaymentsReporting;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Date getOpeningBalanceDate() {
        return openingBalanceDate;
    }

    public void setOpeningBalanceDate(Date openingBalanceDate) {
        this.openingBalanceDate = openingBalanceDate;
    }

    public Date getLockmyDataAt() {
        return lockmyDataAt;
    }

    public void setLockmyDataAt(Date lockmyDataAt) {
        this.lockmyDataAt = lockmyDataAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessDetailsModel)) return false;
        BusinessDetailsModel that = (BusinessDetailsModel) o;
        return taxPaymentsReporting == that.taxPaymentsReporting &&
                Objects.equals(businessDetailsID, that.businessDetailsID) &&
                Objects.equals(businessID, that.businessID) &&
                Objects.equals(financialYearID, that.financialYearID) &&
                Objects.equals(tradingName, that.tradingName) &&
                Objects.equals(abnacn, that.abnacn) &&
                Objects.equals(abnBranch, that.abnBranch) &&
                Objects.equals(emailAddress, that.emailAddress) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(fax, that.fax) &&
                Objects.equals(website, that.website) &&
                Objects.equals(openingBalanceDate, that.openingBalanceDate) &&
                Objects.equals(lockmyDataAt, that.lockmyDataAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessDetailsID, businessID, financialYearID, tradingName, abnacn, abnBranch, taxPaymentsReporting, emailAddress, phone, fax, website, openingBalanceDate, lockmyDataAt);
    }

    @Override
    public String toString() {
        return "BusinessDetailsModel{" +
                "businessDetailsID=" + businessDetailsID +
                ", businessID=" + businessID +
                ", financialYearID=" + financialYearID +
                ", tradingName='" + tradingName + '\'' +
                ", abnacn='" + abnacn + '\'' +
                ", abnBranch='" + abnBranch + '\'' +
                ", taxPaymentsReporting=" + taxPaymentsReporting +
                ", emailAddress='" + emailAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", website='" + website + '\'' +
                ", openingBalanceDate=" + openingBalanceDate +
                ", lockmyDataAt=" + lockmyDataAt +
                '}';
    }



}
