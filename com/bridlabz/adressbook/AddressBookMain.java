package com.bridlabz.adressbook;

import java.util.Scanner;

public class AddressBookMain extends InputMethods  {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
        InputMethods inputMethods = new InputMethods();
        System.out.println("Welcome to the address Book Program!!");
        System.out.println("How many Person you want to add in address book:");
        int person = scanner.nextInt();
        Contacts[] array = new Contacts[person];
        int result =0;
        while(result!=4) {
            System.out.println();
            System.out.println("Select the option from following Menu");
            System.out.println("1. Add" + " 2. Edit" + " 3. Print" + "4. Delete" + " 5. Stop");
            result = scanner.nextInt();
            switch (result) {
                case 1:
                    inputMethods.add(person, array);
                    break;
                case 2:
                    inputMethods.edit(person,array);
                    break;
                case 3:
                    inputMethods.print(person, array);
                    break;
                case 4:
                    inputMethods.delete(person, array);
                    break;
                case 5:
                    System.out.println("Thank You!!");
                    break;
                default:
                    System.out.println("Invalid input!!");
            }
        }
    }
    }

