package com.example.countryflag;

public class countryFlag {
    private String countryName;
    private int imageResourceID;

    public countryFlag(String countryName, int imageResourceID){
        this.countryName = countryName;
        this.imageResourceID = imageResourceID;
    }
    public String getCountryName(){
        return countryName;
    }
    public int getImageResourceID(){
        return imageResourceID;
    }
}
