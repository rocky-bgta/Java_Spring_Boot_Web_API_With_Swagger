package com.nybsys.tillboxweb.models.security;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Date;
import java.util.Objects;

public class SessionModel  {
    private Integer sessionID;
    private Integer userID;
    private String token;
    private Date start;
    private Date end;
    private Integer duration;
    private Integer loginStatus;
    private String refreshToken;
    private String businessDBName;
    private Integer businessID;
    private Integer currentCurrencyID;

    public Integer getSessionID() {
        return sessionID;
    }

    public void setSessionID(Integer sessionID) {
        this.sessionID = sessionID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getBusinessDBName() {
        return businessDBName;
    }

    public void setBusinessDBName(String businessDBName) {
        this.businessDBName = businessDBName;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getCurrentCurrencyID() {
        return currentCurrencyID;
    }

    public void setCurrentCurrencyID(Integer currentCurrencyID) {
        this.currentCurrencyID = currentCurrencyID;
    }
}
