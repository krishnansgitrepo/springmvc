package org.example.app.dto;

public class Phone {

    private String countryCode;
    private String phoneNumber;


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return this.getCountryCode()+"-"+this.getPhoneNumber();
    }
}
