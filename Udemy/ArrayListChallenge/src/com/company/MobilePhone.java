package com.company;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    // The mobile phone should have the options of Quit, Print list of contacts,
    // add new contact, update existing contact, remove contact, and search/find contact

    private static List<Contact> contactList = new ArrayList<Contact>();



    public static List<Contact> getContactList() {
        return contactList;
    }

    public static void addContact(String name, String phone){
        Contact contact = new Contact(name,phone);
        contactList.add(contact);
        System.out.println("Contact with the name : "+contact.name+"\n"+ " and number: "+contact.phoneNumber);
    }

    public static void updateExistingContact(String oldName,String newPhone){
        int position = findItem(oldName);
        if(position>=0){
            updateExistingContact(position,newPhone);
        }
        else{
            System.out.println("The contact doesn't exist in the mobile phone");
        }
    }

    public static void updateExistingContact(int position, String newPhone){
        Contact existingContact = contactList.get(position);
        existingContact.setPhoneNumber(newPhone);
        contactList.set(position,existingContact);
        System.out.println("Phone number for "+existingContact.name+" has been updated");
    }

    public void printContactList(){
        System.out.print("You have "+contactList.size()+" contacts");
        for(Contact s:contactList){
            System.out.println("***************");
            System.out.println("Name:  "+s.name);
            System.out.println("Phone: "+s.phoneNumber);
            System.out.println("***************");
        }
    }


    public static void removeContact(String name){
        int position = findItem(name);
        System.out.println("******************************");
        System.out.println(position);
        System.out.println(contactList.size());
        System.out.println("******************************");
        if(position>=0){
            contactList.remove(position);
        }
        else{
            System.out.println("There is no contact with the name :"+name+" in the mobile phone");
        }
    }


    public static void removeContact(int position){
        Contact theContact = contactList.get(position);
        System.out.println("The contact with the name "+theContact.name+" has been removed from the mobile phone");
        contactList.remove(position);
    }


    public static void searchContact(String name){
        int position = findItem(name);
        Contact contact = new Contact();
        if(position>=0){
            contact = contactList.get(position);
            System.out.println("****************");
            System.out.println("Name:  "+contact.name);
            System.out.println("Phone: "+contact.phoneNumber);
        }else{
            System.out.println("There is no contact with the name "+name+" in the mobile phone");
        }
    }


    public static int findItem(String name){
        int counter = 0;
        for(Contact contact:contactList){
            counter++;
            if(contact.name.equals(name)){
                return counter;
            }
        }
        return -1;
    }
}