/**
 * Created By: Md. Rashed Khan Menon
 * Created Date: 23/02/2018
 * Time: 10:15
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */

package com.nybsys.tillboxweb.models.purchase;

import com.nybsys.tillboxweb.models.accounting.OpeningBalanceModel;
import com.nybsys.tillboxweb.models.common.UserDefineSettingModel;
import com.nybsys.tillboxweb.models.common.VMRememberNoteModel;
import com.nybsys.tillboxweb.models.common.VMUserDetailSettingDetailModel;
import com.nybsys.tillboxweb.models.inventory.RememberNoteModel;

import java.util.ArrayList;
import java.util.List;

public class VMSupplierModel {
    public SupplierModel supplierModel = new SupplierModel();
    public OpeningBalanceModel openingBalanceModel = new OpeningBalanceModel();
    public List<SupplierAddressModel> lstSupplierAddressModel = new ArrayList<>();
    public List<SupplierContactModel> lstSupplierContactModel = new ArrayList<>();
    public BankingDetailsModel bankingDetailsModel = new BankingDetailsModel();
   // public VMRememberNoteModel vmRememberNoteModel = new VMRememberNoteModel();
    public VMUserDetailSettingDetailModel vmUserDetailSettingDetailModel = new VMUserDetailSettingDetailModel();
    public ReportingLayoutModel reportingLayoutModel = new ReportingLayoutModel();
}
