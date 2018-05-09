/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 09/03/2018
 * Time: 04:03
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.core;

public abstract class BaseModelWithCurrency  extends BaseModel {

    private Integer baseCurrencyID;
    private Integer entryCurrencyID;
    private Double exchangeRate;
    private Double baseCurrencyAmount;

    public Integer getBaseCurrencyID() {
        return baseCurrencyID;
    }

    public void setBaseCurrencyID(Integer baseCurrencyID) {
        this.baseCurrencyID = baseCurrencyID;
    }

    public Double getBaseCurrencyAmount() {
        return baseCurrencyAmount;
    }

    public void setBaseCurrencyAmount(Double baseCurrencyAmount) {
        this.baseCurrencyAmount = baseCurrencyAmount;
    }

    public Integer getEntryCurrencyID() {
        return entryCurrencyID;
    }

    public void setEntryCurrencyID(Integer entryCurrencyID) {
        this.entryCurrencyID = entryCurrencyID;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}

