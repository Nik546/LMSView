package com.leavemanagementview.demo.Model;


public class Holiday {

    String Type;
    String companyId;
    int noOfHolidays;

    public Holiday() {
    }

    public Holiday(String type, String companyId, int noOfHolidays) {
        Type = type;
        this.companyId = companyId;
        this.noOfHolidays = noOfHolidays;

    }

    public String getType() {
        return Type;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setType(String type) {
        Type = type;
    }


    public int getNoOfHolidays() {
        return noOfHolidays;
    }

    public void setNoOfHolidays(int noOfHolidays) {
        this.noOfHolidays = noOfHolidays;
    }

}
