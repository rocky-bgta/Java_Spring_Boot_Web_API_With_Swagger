/**
 * Created By: Md. Abdul Hannan
 * Created Date: 4/18/2018
 * Time: 9:50 AM
 * Modified By:
 * Modified date:
 * (C) CopyRight NybSys ltd.
 */
package com.nybsys.tillboxweb.models.user.registration;

import java.util.ArrayList;
import java.util.List;

public class VMCompanyDetail {

    public CompanyDetailModel companyDetailModel;
    public List<CompanyAddressModel> companyAddressModelList;

    public VMCompanyDetail()
    {
        companyDetailModel=new CompanyDetailModel();
        companyAddressModelList=new ArrayList<>();
    }
}
