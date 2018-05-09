package com.nybsys.tillboxweb.models.inventory; /**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/14/2018
 * Time: 9:45 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */


import java.util.Arrays;
import java.util.Objects;

public class ProductDocumentModel {
    private Integer productDocumentID;
    private Integer productID;
    private Byte[] document;
    private String name;

    public Integer getProductDocumentID() {
        return productDocumentID;
    }

    public void setProductDocumentID(Integer productDocumentID) {
        this.productDocumentID = productDocumentID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public Byte[] getDocument() {
        return document;
    }

    public void setDocument(Byte[] document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductDocumentModel)) return false;
        ProductDocumentModel that = (ProductDocumentModel) o;
        return Objects.equals(getProductDocumentID(), that.getProductDocumentID()) &&
                Objects.equals(getProductID(), that.getProductID()) &&
                Arrays.equals(getDocument(), that.getDocument()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductDocumentID(), getProductID(), getDocument(), getName());
    }

    @Override
    public String toString() {
        return "ProductDocumentModel{" +
                "productDocumentID=" + productDocumentID +
                ", productID=" + productID +
                ", document=" + Arrays.toString(document) +
                ", name='" + name + '\'' +
                '}';
    }
}
