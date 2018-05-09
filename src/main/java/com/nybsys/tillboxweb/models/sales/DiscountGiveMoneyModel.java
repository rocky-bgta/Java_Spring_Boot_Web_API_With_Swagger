/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/03/2018
 * Time: 03:52
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;


import java.util.Objects;

public class DiscountGiveMoneyModel {
    private Integer discountMoneyID;
    private Integer discountSettingID;
    private Boolean isPercentage;
    private Double amount;

    public Integer getDiscountMoneyID() {
        return discountMoneyID;
    }

    public void setDiscountMoneyID(Integer discountMoneyID) {
        this.discountMoneyID = discountMoneyID;
    }

    public Integer getDiscountSettingID() {
        return discountSettingID;
    }

    public void setDiscountSettingID(Integer discountSettingID) {
        this.discountSettingID = discountSettingID;
    }

    public Boolean getPercentage() {
        return isPercentage;
    }

    public void setPercentage(Boolean percentage) {
        isPercentage = percentage;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
