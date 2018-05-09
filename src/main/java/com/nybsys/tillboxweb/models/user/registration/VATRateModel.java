/**
 * Created By: Md. Abdul Hannan
 * Created Date: 4/16/2018
 * Time: 12:54 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.user.registration;



import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class VATRateModel extends BaseModel {

    Integer vATRateID;
    Integer businessID;
    String name;
    Double Rate;
    Boolean isDefault;

    public Integer getvATRateID() {
        return vATRateID;
    }

    public void setvATRateID(Integer vATRateID) {
        this.vATRateID = vATRateID;
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

    public Double getRate() {
        return Rate;
    }

    public void setIsRate(Double rate) {
        Rate = rate;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VATRateModel)) return false;
        if (!super.equals(o)) return false;
        VATRateModel that = (VATRateModel) o;
        return Objects.equals(getvATRateID(), that.getvATRateID()) &&
                Objects.equals(getBusinessID(), that.getBusinessID()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getRate(), that.getRate()) &&
                Objects.equals(isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getvATRateID(), getBusinessID(), getName(), getRate(), isDefault);
    }

    @Override
    public String toString() {
        return "VATRateModel{" +
                "vATRateID=" + vATRateID +
                ", businessID=" + businessID +
                ", name='" + name + '\'' +
                ", Rate=" + Rate +
                ", isDefault=" + isDefault +
                '}';
    }
}
