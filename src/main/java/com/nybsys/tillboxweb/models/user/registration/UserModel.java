package com.nybsys.tillboxweb.models.user.registration;

import com.nybsys.tillboxweb.core.BaseModel;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class UserModel extends BaseModel {


    private String userID;

    @NotNull(message = "password cannot be empty")
    @Size(min = 6, max = 50, message = "password name must be between 6 and 50 characters")
    private String password;

    @NotNull(message = "name cannot be empty")
    private String name;

    private String surname;

    @Size(min = 0, max = 10, message = "cellPhone name must be between 0 and 10 characters")
    private String cellPhone;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserModel)) return false;
        if (!super.equals(o)) return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(getUserID(), userModel.getUserID()) &&
                Objects.equals(getPassword(), userModel.getPassword()) &&
                Objects.equals(getName(), userModel.getName()) &&
                Objects.equals(getSurname(), userModel.getSurname()) &&
                Objects.equals(getCellPhone(), userModel.getCellPhone());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getUserID(), getPassword(), getName(), getSurname(), getCellPhone());
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "userID='" + userID + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}
