/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/23/2018
 * Time: 12:35 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.purchase;


public class SupplierReturnDetailModel {

    private Integer supplierReturnDetailID;
    private Integer supplierReturnID;
    private Integer supplierInvoiceID;
    private Integer productID;
    private Double quantity;
    private Double price;
    private Double VAT;
    private Double discount;

    public Integer getSupplierReturnDetailID() {
        return supplierReturnDetailID;
    }

    public void setSupplierReturnDetailID(Integer supplierReturnDetailID) {
        this.supplierReturnDetailID = supplierReturnDetailID;
    }

    public Integer getSupplierReturnID() {
        return supplierReturnID;
    }

    public void setSupplierReturnID(Integer supplierReturnID) {
        this.supplierReturnID = supplierReturnID;
    }

    public Integer getSupplierInvoiceID() {
        return supplierInvoiceID;
    }

    public void setSupplierInvoiceID(Integer supplierInvoiceID) {
        this.supplierInvoiceID = supplierInvoiceID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVAT() {
        return VAT;
    }

    public void setVAT(Double VAT) {
        this.VAT = VAT;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
