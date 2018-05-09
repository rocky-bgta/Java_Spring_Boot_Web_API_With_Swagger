/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 12/03/2018
 * Time: 11:53
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.sales;


import java.util.Objects;

public class SalesRepresentativeModel {
    private Integer salesRepresentativeID;
    private Integer businessID;
    private String name;
    private String designation;
    private String phone;

    public Integer getSalesRepresentativeID() {
        return salesRepresentativeID;
    }

    public void setSalesRepresentativeID(Integer salesRepresentativeID) {
        this.salesRepresentativeID = salesRepresentativeID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
