/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 15/03/2018
 * Time: 03:16
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;

import java.util.Objects;

public class DiscountGiveProductModel {
    private Integer discountGiveProductID;
    private Integer discountSettingID;
    private Integer productID;
    private Double  amount;

    public Integer getDiscountGiveProductID() {
        return discountGiveProductID;
    }

    public void setDiscountGiveProductID(Integer discountGiveProductID) {
        this.discountGiveProductID = discountGiveProductID;
    }

    public Integer getDiscountSettingID() {
        return discountSettingID;
    }

    public void setDiscountSettingID(Integer discountSettingID) {
        this.discountSettingID = discountSettingID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
