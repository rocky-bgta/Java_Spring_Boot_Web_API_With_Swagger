/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 20/04/2018
 * Time: 10:02
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.user.registration;


import java.util.Objects;

public class BrandingModel {

    private Integer brandingID;
    private Integer businessID;
    private Byte[] logo;
    private Integer positionOfLogoOnInvoiceAndStatement;
    private Boolean isLogoOnInvoiceAndStatementEmail;
    private Boolean isLogoOnCustomerZone;

    public Integer getBrandingID() {
        return brandingID;
    }

    public void setBrandingID(Integer brandingID) {
        this.brandingID = brandingID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public Byte[] getLogo() {
        return logo;
    }

    public void setLogo(Byte[] logo) {
        this.logo = logo;
    }

    public Integer getPositionOfLogoOnInvoiceAndStatement() {
        return positionOfLogoOnInvoiceAndStatement;
    }

    public void setPositionOfLogoOnInvoiceAndStatement(Integer positionOfLogoOnInvoiceAndStatement) {
        this.positionOfLogoOnInvoiceAndStatement = positionOfLogoOnInvoiceAndStatement;
    }

    public Boolean getIsLogoOnInvoiceAndStatementEmail() {
        return isLogoOnInvoiceAndStatementEmail;
    }

    public void setIsLogoOnInvoiceAndStatementEmail(Boolean isLogoOnInvoiceAndStatementEmail) {
        this.isLogoOnInvoiceAndStatementEmail = isLogoOnInvoiceAndStatementEmail;
    }

    public Boolean getIsLogoOnCustomerZone() {
        return isLogoOnCustomerZone;
    }

    public void setIsLogoOnCustomerZone(Boolean isLogoOnCustomerZone) {
        this.isLogoOnCustomerZone = isLogoOnCustomerZone;
    }

}
