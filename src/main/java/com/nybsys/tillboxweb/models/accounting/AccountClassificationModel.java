package com.nybsys.tillboxweb.models.accounting;
import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class AccountClassificationModel extends BaseModel {

    private Integer accountClassificationID;

    private String name;

    @Override
    public String toString() {
        return "AccountClassificationModel{" +
                "accountClassificationID=" + accountClassificationID +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountClassificationModel)) return false;
        AccountClassificationModel that = (AccountClassificationModel) o;
        return Objects.equals(accountClassificationID, that.accountClassificationID) &&
                Objects.equals(name, that.name) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountClassificationID, name, code);
    }
}
