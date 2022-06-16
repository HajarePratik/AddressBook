package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {

    Map<String, AddressBook> addressBookMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addAddressBook() {
        System.out.println("Enter a Address Book Name :- ");
        String addressBookName = sc.nextLine();
        if (!isAvailable(addressBookName)) {
            addressBookMap.put(addressBookName, new AddressBook());
        } else {
            System.out.println("This Address Book Already Exist");
        }

    }

    public void updateAddressBook() {

    }

    public void deleteAddressBook() {

    }

    public void displayAddressBook() {
        for (String key : addressBookMap.keySet()) {
            System.out.println(key);
        }

    }

    public void selectAddressBook() {
        displayAddressBook();
        System.out.println("Enter the Address Book Name To Select :- ");
        String addressBookName = sc.nextLine();
        if (isAvailable(addressBookName)) {
            AddressBook addressBook = addressBookMap.get(addressBookName);
            addressBook.contactMenu();
        } else {
            System.out.println("No Address Book Found");
        }

    }

    public boolean isAvailable(String bookName) {
        for (String key : addressBookMap.keySet()) {
            if (key.contains(bookName)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add Address Book\n2.Update Address Book\n3.Delete Address Book \n4.Display Address Book\n5.Select Address Book\n6.Exit");
            System.out.println("Enter Your Choice :- ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addressBookMain.addAddressBook();
                    break;
                case 2:
                    addressBookMain.updateAddressBook();
                    break;
                case 3:
                    addressBookMain.deleteAddressBook();
                    break;
                case 4:
                    addressBookMain.displayAddressBook();
                    break;
                case 5:
                    addressBookMain.selectAddressBook();
                    break;
                default:
                    System.out.println("Thank You !");
                    break;
            }
        } while (choice <= 5);
    }
}
