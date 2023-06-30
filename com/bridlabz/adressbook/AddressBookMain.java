package com.bridlabz.adressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args)
    {
        System.out.println("uc1");
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

        //uc2
        System.out.println("Welcome to the address Book Program!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Person you want to add in address book:");
        int person = scanner.nextInt();
        Contacts[] array = new Contacts[person];
        for(int i=0; i< person; i++){
            System.out.println("Enter "+(i+1)+" person firstname : ");
            String firstName = scanner.next();

            System.out.println("Enter "+(i+1)+" person lastname : ");
            String lastName = scanner.next();

            System.out.println("Enter "+(i+1)+" person address : ");
            String address = scanner.next();

            System.out.println("Enter "+(i+1)+" person city : ");
            String city = scanner.next();

            System.out.println("Enter "+(i+1)+" person state : ");
            String state = scanner.next();

            System.out.println("Enter "+(i+1)+" person email : ");
            String email = scanner.next();

            System.out.println("Enter "+(i+1)+" person phoneNo : ");
            int phoneNo = scanner.nextInt();

            System.out.println("Enter "+(i+1)+" person zip : ");
            int zip = scanner.nextInt();

            Contacts contacts1 = new Contacts(firstName,lastName,address, city, state, zip, phoneNo,email);
            array[i]=contacts1;
        }

        System.out.println();
        System.out.println("*******Address Book************");
        for (int i=0; i< person ; i++){
            System.out.println(array[i].firstName+ " "+ array[i].lastName+ " "+array[i].address+ " "
                    +array[i].phoneNo+" "+array[i].state+ " "+array[i].city+ " "+array[i].zip);
        }
    }

}
