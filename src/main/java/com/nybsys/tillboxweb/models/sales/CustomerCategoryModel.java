/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 12/03/2018
 * Time: 11:59
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;


import java.util.Objects;

public class CustomerCategoryModel{
    private Integer customerCategoryID;
    private Integer businessID;
    private String categoryName;

    public Integer getCustomerCategoryID() {
        return customerCategoryID;
    }

    public void setCustomerCategoryID(Integer customerCategoryID) {
        this.customerCategoryID = customerCategoryID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
