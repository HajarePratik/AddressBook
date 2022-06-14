package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> arrayList = new ArrayList<>();

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("Enter a First Name :- ");
        contact.setFirstName(scanner.nextLine());
        System.out.println("Enter a Last Name :- ");
        contact.setLastName(scanner.nextLine());
        System.out.println("Enter a Mobile Number :- ");
        contact.setMobileNo(scanner.nextLine());
        System.out.println("Enter a Email Id :- ");
        contact.setEmailId(scanner.nextLine());
        System.out.println("Enter a City :- ");
        contact.setCity(scanner.nextLine());
        System.out.println("Enter a State :- ");
        contact.setState(scanner.nextLine());
        System.out.println("Enter a Pincode :- ");
        contact.setPincode(scanner.nextLine());
        arrayList.add(contact);
    }

    public void updateContact() {
        Scanner scanner = new Scanner(System.in);
        Contact contact;
        System.out.println("Enter the First Name Which You Want to Update : ");
        String firstName = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            contact = arrayList.get(i);
            if (contact.getFirstName().equals(firstName)) {

                System.out.println("Enter a First Name :- ");
                contact.setFirstName(scanner.nextLine());
                System.out.println("Enter a Last Name :- ");
                contact.setLastName(scanner.nextLine());
                System.out.println("Enter a Mobile Number :- ");
                contact.setMobileNo(scanner.nextLine());
                System.out.println("Enter a Email Id :- ");
                contact.setEmailId(scanner.nextLine());
                System.out.println("Enter a City :- ");
                contact.setCity(scanner.nextLine());
                System.out.println("Enter a State :- ");
                contact.setState(scanner.nextLine());
                System.out.println("Enter a Pincode :- ");
                contact.setPincode(scanner.nextLine());
                arrayList.add(contact);
            } else {
                System.out.println("No Contact Found");
            }
        }

    }

    public void displayContact() {
        System.out.println(arrayList);
    }

    public void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        Contact contact;
        System.out.println("Enter the First Name Which You Want to Delete : ");
        String firstName = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            contact = arrayList.get(i);
            if (contact.getFirstName().equals(firstName)) {
                arrayList.remove(contact);
            }
        }
    }

}
