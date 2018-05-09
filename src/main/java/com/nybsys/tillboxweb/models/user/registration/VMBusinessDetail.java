package com.nybsys.tillboxweb.models.user.registration;

import java.util.ArrayList;
import java.util.List;

public class VMBusinessDetail {
    public BusinessDetailsModel businessDetailsModel;
    public List<BusinessContactModel> lstBusinessContactModel;
    public List<BusinessAddressModel> lstBusinessAddressModel;
    public List<FinancialYearModel> lstFinancialYearModel;
    public List<CountryModel> lstCountryModel;
    public VMBusinessDetail() {
        //super();
        this.businessDetailsModel = new BusinessDetailsModel();
        this.lstBusinessContactModel = new ArrayList<>();
        this.lstBusinessAddressModel = new ArrayList<>();
        this.lstFinancialYearModel = new ArrayList<>();
        this.lstCountryModel=new ArrayList<>();
    }

}
