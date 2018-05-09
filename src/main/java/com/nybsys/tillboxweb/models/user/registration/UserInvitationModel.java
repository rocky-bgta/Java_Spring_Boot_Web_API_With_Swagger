package com.nybsys.tillboxweb.models.user.registration;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Date;
import java.util.Objects;

public class UserInvitationModel extends BaseModel {

    private Integer userInvitationEntityID;
    private String userID;
    private String firstName;
    private String lastName;
    private String token;
    private Integer businessID;
    private Integer accessRightID;
    private Date expireDate;
    private boolean done;

    public Integer getUserInvitationEntityID() {
        return userInvitationEntityID;
    }

    public void setUserInvitationEntityID(Integer userInvitationEntityID) {
        this.userInvitationEntityID = userInvitationEntityID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getAccessRightID() {
        return accessRightID;
    }

    public void setAccessRightID(Integer accessRightID) {
        this.accessRightID = accessRightID;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInvitationModel)) return false;
        UserInvitationModel that = (UserInvitationModel) o;
        return done == that.done &&
                Objects.equals(userInvitationEntityID, that.userInvitationEntityID) &&
                Objects.equals(userID, that.userID) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(token, that.token) &&
                Objects.equals(businessID, that.businessID) &&
                Objects.equals(accessRightID, that.accessRightID) &&
                Objects.equals(expireDate, that.expireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userInvitationEntityID, userID, firstName, lastName, token, businessID, accessRightID, expireDate, done);
    }

    @Override
    public String toString() {
        return "UserInvitationModel{" +
                "userInvitationEntityID=" + userInvitationEntityID +
                ", userID='" + userID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", token='" + token + '\'' +
                ", businessID=" + businessID +
                ", accessRightID=" + accessRightID +
                ", expireDate=" + expireDate +
                ", done=" + done +
                '}';
    }

}
