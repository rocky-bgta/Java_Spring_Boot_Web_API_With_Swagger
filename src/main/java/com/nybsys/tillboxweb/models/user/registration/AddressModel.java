package com.nybsys.tillboxweb.models.user.registration;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class AddressModel extends BaseModel {

    private Integer addressID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressModel)) return false;
        AddressModel that = (AddressModel) o;
        return Objects.equals(addressID, that.addressID) &&
                Objects.equals(businessID, that.businessID) &&
                Objects.equals(typeID, that.typeID) &&
                Objects.equals(address, that.address) &&
                Objects.equals(suburb, that.suburb) &&
                Objects.equals(state, that.state) &&
                Objects.equals(postCode, that.postCode) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressID, businessID, typeID, address, suburb, state, postCode, country);
    }

    private Integer businessID;
    private Integer typeID;
    private String address;
    private String suburb;
    private String state;

    @Override
    public String toString() {
        return "AddressModel{" +
                "addressID=" + addressID +
                ", businessID=" + businessID +
                ", typeID=" + typeID +
                ", address='" + address + '\'' +
                ", suburb='" + suburb + '\'' +
                ", state='" + state + '\'' +
                ", postCode='" + postCode + '\'' +
                ", country=" + country +
                '}';
    }

    private String postCode;
    private Integer country;

}
