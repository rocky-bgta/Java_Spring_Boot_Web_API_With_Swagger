package com.nybsys.tillboxweb.models.accounting;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class AccountTypeModel extends BaseModel {
    private Integer accountTypeID;
    private Integer accountClassificationID;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountTypeModel)) return false;
        AccountTypeModel that = (AccountTypeModel) o;
        return Objects.equals(accountTypeID, that.accountTypeID) &&
                Objects.equals(accountClassificationID, that.accountClassificationID) &&
                Objects.equals(typeName, that.typeName) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountTypeID, accountClassificationID, typeName, code);
    }

    @Override
    public String toString() {
        return "AccountTypeModel{" +
                "accountTypeID=" + accountTypeID +
                ", accountClassificationID=" + accountClassificationID +
                ", typeName='" + typeName + '\'' +
                ", code=" + code +
                '}';
    }

    private String typeName;
    private Integer code;

}
