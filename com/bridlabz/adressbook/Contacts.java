package com.bridlabz.adressbook;

public class Contacts {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    int phoneNo;
    String email;

    public Contacts(String firstName, String lastName, String address, String city, String state,
                    int zip, int phoneNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
        this.email = email;
    }
}
