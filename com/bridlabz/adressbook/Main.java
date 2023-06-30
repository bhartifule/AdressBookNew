package com.bridlabz.adressbook;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome In Address Book Problem");
        Contacts contacts = new Contacts("Bharati" ,"Fule","Hingna_Nagpur","Nagpur","MH",
                441110,914680033,"bharatif10@gmail.com");
        System.out.println(contacts.firstName);
        System.out.println(contacts.lastName);
        System.out.println(contacts.address);
        System.out.println(contacts.city);
        System.out.println(contacts.state);
        System.out.println(contacts.zip);
        System.out.println(contacts.phoneNo);
        System.out.println(contacts.email);

    }
}
