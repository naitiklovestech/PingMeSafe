package com.example.pingmesafe.FireBase;

import android.net.Uri;

public class User_Data_Model {

    String fname, lname,  email,  dob,  number;
    double latitude, longitude;
    int selected_profile_image;

    public User_Data_Model() {
    }

    public int getSelected_profile_image() {
        return selected_profile_image;
    }

    public void setSelected_profile_image(int selected_profile_image) {
        this.selected_profile_image = selected_profile_image;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public User_Data_Model(String fname, String lname, String email, String dob, String number, double latitude, double longitude, int selected_profile_image) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.dob = dob;
        this.number = number;
        this.latitude = latitude;
        this.longitude = longitude;
        this.selected_profile_image = selected_profile_image;
    }
}
