package com.nybsys.tillboxweb.models.user.registration;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class BusinessContactModel extends BaseModel{
    private Integer businessContactID;
    private Integer businessID;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean primaryContact;

    public Integer getBusinessContactID() {
        return businessContactID;
    }

    public void setBusinessContactID(Integer businessContactID) {
        this.businessContactID = businessContactID;
    }

    public Integer getBusinessID() {
        return businessID;
    }

    public void setBusinessID(Integer businessID) {
        this.businessID = businessID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(boolean primaryContact) {
        this.primaryContact = primaryContact;
    }

    @Override
    public String toString() {
        return "BusinessContactModel{" +
                "businessContactID=" + businessContactID +
                ", businessID=" + businessID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", primaryContact=" + primaryContact +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessContactModel)) return false;
        BusinessContactModel that = (BusinessContactModel) o;
        return primaryContact == that.primaryContact &&
                Objects.equals(businessContactID, that.businessContactID) &&
                Objects.equals(businessID, that.businessID) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessContactID, businessID, firstName, lastName, email, phone, primaryContact);
    }


}
