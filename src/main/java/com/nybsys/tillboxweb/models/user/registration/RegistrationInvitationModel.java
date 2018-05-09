/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 18/04/2018
 * Time: 10:41
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.user.registration;

import java.util.Date;

public class RegistrationInvitationModel {

    private Integer registrationInvitationID;
    private String userID;
    private String surName;
    private String name;
    private String cellPhone;
    private String password;
    private String token;
    private Integer productTypeID;
    private Integer businessTypeID;
    private Date expireDate;
    private Boolean done;

    public Integer getRegistrationInvitationID() {
        return registrationInvitationID;
    }

    public void setRegistrationInvitationID(Integer registrationInvitationID) {
        this.registrationInvitationID = registrationInvitationID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    public Integer getBusinessTypeID() {
        return businessTypeID;
    }

    public void setBusinessTypeID(Integer businessTypeID) {
        this.businessTypeID = businessTypeID;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
