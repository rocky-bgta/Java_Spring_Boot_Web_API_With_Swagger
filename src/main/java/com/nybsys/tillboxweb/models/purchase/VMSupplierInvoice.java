/**
 * Created By: Md. Abdul Hannan
 * Created Date: 2/23/2018
 * Time: 12:50 PM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.purchase;



import java.util.ArrayList;
import java.util.List;

public class VMSupplierInvoice {

    public SupplierInvoiceModel supplierInvoiceModel;
    public List<SupplierInvoiceDetailModel> lstSupplierInvoiceDetailModel;

    public VMSupplierInvoice()
    {
        supplierInvoiceModel=new SupplierInvoiceModel();
        lstSupplierInvoiceDetailModel=new ArrayList<>();
    }

}
