package com.nybsys.tillboxweb.models.user.registration;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class ProductTypeModel extends BaseModel {

    private Integer productTypeID;
    private String name;

    @Override
    public String toString() {
        return "ProductTypeModel{" +
                "productTypeID=" + productTypeID +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductTypeModel)) return false;
        ProductTypeModel that = (ProductTypeModel) o;
        return Objects.equals(productTypeID, that.productTypeID) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTypeID, name);
    }
}
