/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 02/05/2018
 * Time: 03:54
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.user.registration;


import java.util.Date;
import java.util.Objects;

public class LiveExchangeRateModel  {
    private Integer liveExchangeRateID;
    private Integer businessID;
    private Integer baseCurrencyID;
    private String exchangeRateJSON;
    private Date date;

    public Integer getLiveExchangeRateID() {
        return liveExchangeRateID;
    }

    public void setLiveExchangeRateID(Integer liveExchangeRateID) {
        this.liveExchangeRateID = liveExchangeRateID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getBaseCurrencyID() {
        return baseCurrencyID;
    }

    public void setBaseCurrencyID(Integer baseCurrencyID) {
        this.baseCurrencyID = baseCurrencyID;
    }

    public String getExchangeRateJSON() {
        return exchangeRateJSON;
    }

    public void setExchangeRateJSON(String exchangeRateJSON) {
        this.exchangeRateJSON = exchangeRateJSON;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
