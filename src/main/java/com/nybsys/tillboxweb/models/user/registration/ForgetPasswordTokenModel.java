package com.nybsys.tillboxweb.models.user.registration;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Date;
import java.util.Objects;

public class ForgetPasswordTokenModel extends BaseModel {
    private Integer forgetPasswordTokenID;
    private String userID;
    private String token;
    private Date validation;

    public Integer getForgetPasswordTokenID() {
        return forgetPasswordTokenID;
    }

    public void setForgetPasswordTokenID(Integer forgetPasswordTokenID) {
        this.forgetPasswordTokenID = forgetPasswordTokenID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getValidation() {
        return validation;
    }

    public void setValidation(Date validation) {
        this.validation = validation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForgetPasswordTokenModel)) return false;
        ForgetPasswordTokenModel that = (ForgetPasswordTokenModel) o;
        return Objects.equals(forgetPasswordTokenID, that.forgetPasswordTokenID) &&
                Objects.equals(userID, that.userID) &&
                Objects.equals(token, that.token) &&
                Objects.equals(validation, that.validation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forgetPasswordTokenID, userID, token, validation);
    }

    @Override
    public String toString() {
        return "ForgetPasswordTokenModel{" +
                "forgetPasswordTokenID=" + forgetPasswordTokenID +
                ", userID='" + userID + '\'' +
                ", token='" + token + '\'' +
                ", validation=" + validation +
                '}';
    }

}
