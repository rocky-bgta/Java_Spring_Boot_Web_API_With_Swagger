/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/9/2018
 * Time: 10:58 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.user.registration;

import javax.xml.crypto.Data;
import java.util.Date;

public class CurrencyExchangeRateModel{

    private Integer currencyExchangeRateID;
    private Date date;
    private Integer currencyID;
    private Double rate;

    public Integer getCurrencyExchangeRateID() {
        return currencyExchangeRateID;
    }

    public void setCurrencyExchangeRateID(Integer currencyExchangeRateID) {
        this.currencyExchangeRateID = currencyExchangeRateID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(Integer currencyID) {
        this.currencyID = currencyID;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
