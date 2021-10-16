package com.example.nationservletjsp.model;

import java.util.Date;

public class Countries {
    int countryID ;
    String name;
    int area;
    Date nationDay;
    String countryCode2;
    String countryCode3;

    public Countries() {
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public Date getNationDay() {
        return nationDay;
    }

    public void setNationDay(Date nationDay) {
        this.nationDay = nationDay;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }
}
