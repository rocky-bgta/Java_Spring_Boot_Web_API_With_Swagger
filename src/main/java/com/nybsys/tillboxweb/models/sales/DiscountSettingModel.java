/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/03/2018
 * Time: 04:09
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;


import java.util.Objects;

public class DiscountSettingModel {
    private Integer discountSettingID;
    private Integer discountDependingOn;
    private Integer type;
    private Double targetAmount;

    public Integer getDiscountSettingID() {
        return discountSettingID;
    }

    public void setDiscountSettingID(Integer discountSettingID) {
        this.discountSettingID = discountSettingID;
    }

    public Integer getDiscountDependingOn() {
        return discountDependingOn;
    }

    public void setDiscountDependingOn(Integer discountDependingOn) {
        this.discountDependingOn = discountDependingOn;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getTargetAmount() {
        return targetAmount;
    }

    public void setTargetAmount(Double targetAmount) {
        this.targetAmount = targetAmount;
    }

}
