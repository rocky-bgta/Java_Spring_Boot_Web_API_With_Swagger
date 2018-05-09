/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 27/03/2018
 * Time: 05:38
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.expense;



public class ExpenseAdjustmentDetailModel {
    private Integer expenseAdjustmentDetailID;
    private Integer expenseAdjustmentID;
    private Integer expenseDetailID;
    private Double amount;
    private Integer accountIDFrom;
    private Integer accountIDExpense;

    public Integer getExpenseAdjustmentDetailID() {
        return expenseAdjustmentDetailID;
    }

    public void setExpenseAdjustmentDetailID(Integer expenseAdjustmentDetailID) {
        this.expenseAdjustmentDetailID = expenseAdjustmentDetailID;
    }

    public Integer getExpenseAdjustmentID() {
        return expenseAdjustmentID;
    }

    public void setExpenseAdjustmentID(Integer expenseAdjustmentID) {
        this.expenseAdjustmentID = expenseAdjustmentID;
    }

    public Integer getExpenseDetailID() {
        return expenseDetailID;
    }

    public void setExpenseDetailID(Integer expenseDetailID) {
        this.expenseDetailID = expenseDetailID;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getAccountIDFrom() {
        return accountIDFrom;
    }

    public void setAccountIDFrom(Integer accountIDFrom) {
        this.accountIDFrom = accountIDFrom;
    }

    public Integer getAccountIDExpense() {
        return accountIDExpense;
    }

    public void setAccountIDExpense(Integer accountIDExpense) {
        this.accountIDExpense = accountIDExpense;
    }
}
