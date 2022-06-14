package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {


    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome To Address Book");
            System.out.println("1.Add Contact\n2.Update Contact\n3.Delete Contact \n4.Display Contacts \n5.Exit");
            System.out.println("Enter Your Choice from Above : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.updateContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    addressBook.displayContact();
                    break;
                default:
                    System.out.println("Thank You !");
                    break;
            }
        } while (choice < 5);
    }
}
