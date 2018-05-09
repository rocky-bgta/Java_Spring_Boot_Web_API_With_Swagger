/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 23/02/2018
 * Time: 10:19
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.purchase;


import java.util.Objects;

public class ReportingLayoutModel{
    private Integer reportingLayoutID;
    private Integer businessID;
    private Integer contactID;
    private Integer reportNameID;
    private Integer layoutID;


    public Integer getReportingLayoutID() {
        return reportingLayoutID;
    }

    public void setReportingLayoutID(Integer reportingLayoutID) {
        this.reportingLayoutID = reportingLayoutID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Integer getContactID() {
        return contactID;
    }

    public void setContactID(Integer contactID) {
        this.contactID = contactID;
    }

    public Integer getReportNameID() {
        return reportNameID;
    }

    public void setReportNameID(Integer reportNameID) {
        this.reportNameID = reportNameID;
    }

    public Integer getLayoutID() {
        return layoutID;
    }

    public void setLayoutID(Integer layoutID) {
        this.layoutID = layoutID;
    }

}
