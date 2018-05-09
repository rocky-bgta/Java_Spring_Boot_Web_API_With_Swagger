/**
 * Created By: Md. Abdul Hannan
 * Created Date: 4/16/2018
 * Time: 11:20 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.user.registration;



import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class AdditionalCompanyInformationModel extends BaseModel {
    Integer additionalCompanyInformationID;
    Integer businessID;
    Integer city;
    Integer province;
    Integer country;
    String customsCode;

    public void setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
    }

    public Integer getAdditionalCompanyInformationID() {
        return additionalCompanyInformationID;
    }

    public void setAdditionalCompanyInformationID(Integer additionalCompanyInformationID) {
        this.additionalCompanyInformationID = additionalCompanyInformationID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdditionalCompanyInformationModel)) return false;
        if (!super.equals(o)) return false;
        AdditionalCompanyInformationModel that = (AdditionalCompanyInformationModel) o;
        return Objects.equals(getAdditionalCompanyInformationID(), that.getAdditionalCompanyInformationID()) &&
                Objects.equals(getBusinessID(), that.getBusinessID()) &&
                Objects.equals(getCity(), that.getCity()) &&
                Objects.equals(getProvince(), that.getProvince()) &&
                Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAdditionalCompanyInformationID(), getBusinessID(), getCity(), getProvince(), getCountry());
    }

    @Override
    public String toString() {
        return "AdditionalCompanyInformationModel{" +
                "additionalCompanyInformationID=" + additionalCompanyInformationID +
                ", businessID=" + businessID +
                ", city=" + city +
                ", province=" + province +
                ", country=" + country +
                '}';
    }
}
