package com.nybsys.tillboxweb.models.user.registration;

import java.math.BigInteger;
import java.util.Objects;

public class BusinessModel {
    private Integer businessID;
    private BigInteger serialNo;
    private Integer productTypeID;
    private String businessName;
    private Integer businessTypeID;
    private String businessDBName;
    private String phone;
    private String email;
    private String firstName;
    private Integer subscriptionStatus;

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public BigInteger getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(BigInteger serialNo) {
        this.serialNo = serialNo;
    }

    public Integer getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public Integer getBusinessTypeID() {
        return businessTypeID;
    }

    public void setBusinessTypeID(Integer businessTypeID) {
        this.businessTypeID = businessTypeID;
    }

    public String getBusinessDBName() {
        return businessDBName;
    }

    public void setBusinessDBName(String businessDBName) {
        this.businessDBName = businessDBName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(Integer subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    private String lastName;
    private String owner;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessModel)) return false;
        BusinessModel that = (BusinessModel) o;
        return Objects.equals(businessID, that.businessID) &&
                Objects.equals(serialNo, that.serialNo) &&
                Objects.equals(productTypeID, that.productTypeID) &&
                Objects.equals(businessName, that.businessName) &&
                Objects.equals(businessTypeID, that.businessTypeID) &&
                Objects.equals(businessDBName, that.businessDBName) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(email, that.email) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(subscriptionStatus, that.subscriptionStatus) &&
                Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessID, serialNo, productTypeID, businessName, businessTypeID, businessDBName, phone, email, firstName, lastName, subscriptionStatus, owner);
    }



    @Override
    public String toString() {
        return "BusinessModel{" +
                "businessID=" + businessID +
                ", serialNo=" + serialNo +
                ", productTypeID=" + productTypeID +
                ", businessName='" + businessName + '\'' +
                ", businessTypeID=" + businessTypeID +
                ", businessDBName='" + businessDBName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", subscriptionStatus=" + subscriptionStatus +
                ", owner='" + owner + '\'' +
                '}';
    }



}
