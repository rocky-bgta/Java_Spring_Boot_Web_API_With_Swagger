package com.nybsys.tillboxweb.models.accounting;

import com.nybsys.tillboxweb.core.BaseModel;

import java.util.Objects;

public class CashFlowModel extends BaseModel {
    private Integer cashFlowID;
    private Integer cashFlowName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CashFlowModel)) return false;
        CashFlowModel that = (CashFlowModel) o;
        return Objects.equals(cashFlowID, that.cashFlowID) &&
                Objects.equals(cashFlowName, that.cashFlowName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cashFlowID, cashFlowName);
    }

    @Override
    public String toString() {
        return "CashFlowModel{" +
                "cashFlowID=" + cashFlowID +
                ", cashFlowName=" + cashFlowName +
                '}';
    }

}
