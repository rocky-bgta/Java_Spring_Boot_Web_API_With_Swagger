package com.nybsys.tillboxweb.models.inventory; /**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/14/2018
 * Time: 9:50 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

import java.util.Date;
import java.util.Objects;

public class ProductPurchasePriceModel {

    private Integer productPurchasePriceID;
    private Integer businessID;
    private Date date;
    private Integer productID;
    private Double  purchasePrice;

    public Integer getProductPurchasePriceID() {
        return productPurchasePriceID;
    }

    public void setProductPurchasePriceID(Integer productPurchasePriceID) {
        this.productPurchasePriceID = productPurchasePriceID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductPurchasePriceModel)) return false;
        if (!super.equals(o)) return false;
        ProductPurchasePriceModel that = (ProductPurchasePriceModel) o;
        return Objects.equals(getProductPurchasePriceID(), that.getProductPurchasePriceID()) &&
                Objects.equals(getBusinessID(), that.getBusinessID()) &&
                Objects.equals(getDate(), that.getDate()) &&
                Objects.equals(getProductID(), that.getProductID()) &&
                Objects.equals(getPurchasePrice(), that.getPurchasePrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getProductPurchasePriceID(), getBusinessID(), getDate(), getProductID(), getPurchasePrice());
    }


    @Override
    public String toString() {
        return "ProductPurchasePriceModel{" +
                "productPurchasePriceID=" + productPurchasePriceID +
                ", businessID=" + businessID +
                ", date=" + date +
                ", productID=" + productID +
                ", purchasePrice=" + purchasePrice +
                '}';
    }
}
