package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContactList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the contact list.");
        System.out.println("\t 2 - To add a contact to the mobile phone.");
        System.out.println("\t 3 - To update a contact in the mobile phone");
        System.out.println("\t 4 - To remove a contact from the mobile phone.");
        System.out.println("\t 5 - To search for a contact in the mobile phone.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.println("Please enter the Name of the contact : ");
        String name = scanner.nextLine();
        System.out.println("Please enter the phone number  : ");
        String phone = scanner.nextLine();
        mobilePhone.addContact(name,phone);
    }

    public static void updateContact(){
        System.out.println("Please enter the Name of the contact you want to modify : ");
        String oldName = scanner.nextLine();
        System.out.println("Please enter the new Phone number that you want to modify :");
        String newPhone = scanner.nextLine();
        mobilePhone.updateExistingContact(oldName,newPhone);
    }

    public static void removeItem(){
        System.out.println("Enter the name of the contact that you want to remove from the mobile phone :");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }


    public static void searchForItem(){
        System.out.println("Enter the name of the contact to search for the contact :");
        String name = scanner.nextLine();
        mobilePhone.searchContact(name);
    }

    public static void processArrayList(){
        ArrayList<Contact> newArray = new ArrayList<Contact>();
        newArray.addAll(mobilePhone.getContactList());

        // Same as this newArray.addAll(groceryList.getGroceryList());
        ArrayList<Contact> nextArray = new ArrayList<Contact>(mobilePhone.getContactList());

        String[] myArray = new String[mobilePhone.getContactList().size()];

        myArray = mobilePhone.getContactList().toArray(myArray);
    }

}
