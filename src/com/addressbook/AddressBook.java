package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Contact> arrayList = new ArrayList<>();

    public boolean isEmailAvailable(String emailId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Contact contact = arrayList.get(i);
            if (contact.getEmailId().equalsIgnoreCase(emailId)) {
                return true;
            }
        }
        return false;
    }

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        System.out.println("Enter a Email Id :- ");
        contact.setEmailId(scanner.nextLine());
        if (!isEmailAvailable(contact.getEmailId())) {
            System.out.println("Enter a First Name :- ");
            contact.setFirstName(scanner.nextLine());
            System.out.println("Enter a Last Name :- ");
            contact.setLastName(scanner.nextLine());
            System.out.println("Enter a Mobile Number :- ");
            contact.setMobileNo(scanner.nextLine());
            System.out.println("Enter a City :- ");
            contact.setCity(scanner.nextLine());
            System.out.println("Enter a State :- ");
            contact.setState(scanner.nextLine());
            System.out.println("Enter a Pincode :- ");
            contact.setPincode(scanner.nextLine());
            arrayList.add(contact);
        } else {
            System.out.println("Contact Already Exist");
        }
    }

    public void updateContact() {
        Scanner scanner = new Scanner(System.in);
        Contact contact;
        System.out.println("Enter the Email ID Which You Want to Update : ");
        String emailId = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            contact = arrayList.get(i);
            if (isEmailAvailable(emailId)) {

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

    public void displayContact() {
        System.out.println(arrayList);
    }

    private void searchCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter City What You want to Search:- ");
        String searchCity = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            Contact contact = arrayList.get(i);
            if (searchCity.equalsIgnoreCase(contact.getCity())) {
                System.out.println(contact);
            } else {
                System.out.println("City Not Found");
            }
        }
    }

    public void contactMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome To Address Book");
            System.out.println("1.Add Contact\n2.Update Contact\n3.Delete Contact \n4.Display Contacts \n5.Search City \n6.Exit");
            System.out.println("Enter Your Choice from Above : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    displayContact();
                    break;
                case 5:
                    searchCity();
                    break;
                default:
                    System.out.println("Thank You !");
                    break;
            }
        } while (choice < 6);
    }
}
