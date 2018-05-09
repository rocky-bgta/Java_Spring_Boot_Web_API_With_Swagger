/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 02/05/2018
 * Time: 03:42
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.user.registration;

import java.util.Objects;

public class CurrencySettingModel {
    private Integer currencySettingID;
    private Integer businessID;
    private Boolean useLiveExchangeRate;
    private Integer bankChargesLedgerAccountID;
    private Integer exchangeRateGainLedgerAccountID;
    private Integer exchangeRateLossLedgerAccountID;

    public Integer getCurrencySettingID() {
        return currencySettingID;
    }

    public void setCurrencySettingID(Integer currencySettingID) {
        this.currencySettingID = currencySettingID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Boolean getUseLiveExchangeRate() {
        return useLiveExchangeRate;
    }

    public void setUseLiveExchangeRate(Boolean useLiveExchangeRate) {
        this.useLiveExchangeRate = useLiveExchangeRate;
    }

    public Integer getBankChargesLedgerAccountID() {
        return bankChargesLedgerAccountID;
    }

    public void setBankChargesLedgerAccountID(Integer bankChargesLedgerAccountID) {
        this.bankChargesLedgerAccountID = bankChargesLedgerAccountID;
    }

    public Integer getExchangeRateGainLedgerAccountID() {
        return exchangeRateGainLedgerAccountID;
    }

    public void setExchangeRateGainLedgerAccountID(Integer exchangeRateGainLedgerAccountID) {
        this.exchangeRateGainLedgerAccountID = exchangeRateGainLedgerAccountID;
    }

    public Integer getExchangeRateLossLedgerAccountID() {
        return exchangeRateLossLedgerAccountID;
    }

    public void setExchangeRateLossLedgerAccountID(Integer exchangeRateLossLedgerAccountID) {
        this.exchangeRateLossLedgerAccountID = exchangeRateLossLedgerAccountID;
    }

}
