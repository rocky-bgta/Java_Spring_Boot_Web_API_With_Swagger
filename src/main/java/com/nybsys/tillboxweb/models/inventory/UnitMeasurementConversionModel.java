/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 13/02/2018
 * Time: 12:18
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.inventory;

public class UnitMeasurementConversionModel {

    private Integer unitMeasurementID;
    private Integer businessID;
    private String name;
    private Integer fromUOMID;
    private Integer toUOMID;
    private Double conversionRate;

    public Integer getUnitMeasurementID() {
        return unitMeasurementID;
    }

    public void setUnitMeasurementID(Integer unitMeasurementID) {
        this.unitMeasurementID = unitMeasurementID;
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

    public Integer getFromUOMID() {
        return fromUOMID;
    }

    public void setFromUOMID(Integer fromUOMID) {
        this.fromUOMID = fromUOMID;
    }

    public Integer getToUOMID() {
        return toUOMID;
    }

    public void setToUOMID(Integer toUOMID) {
        this.toUOMID = toUOMID;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }
}
