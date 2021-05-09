package com.company;
//list extends collection
//array extends list
//list is a resizable array;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("434 222 2222");
	private static boolean quit = false;

	public static void main(String[] args) {
		startPhone();
		printActions();
		while (!quit) {
			printActions();
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
				case 0:
					System.out.println("\nshutting down...");
					quit = true;
					break;
				case 1:
					printContacts();
					break;
				case 2:
					addNewContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					removeContact();
					break;
				case 5:
					queryContact();
					break;
				case 6:
					printActions();

			}
		}

	}

	private static void startPhone() {
		System.out.println("Starting phone...");
	}

	public static void printActions() {
		System.out.println("\nAvailable Actions:\npress");
		System.out.println("0 -- to shutdown\n");
		System.out.println("1 -- to print contacts\n");
		System.out.println("2 -- to add an existing Contact\n");
		System.out.println("3 -- to update an existing Contact\n");
		System.out.println("4 -- to remove an existing Contact\n");
		System.out.println("5 -- query if an existing contact exists\n");
		System.out.println("6 -- back to main menu");
		System.out.println("Choose your action: ");
	}

	private static void printContacts() {
		System.out.println("Contact list");
		mobilePhone.printContacts();
	}
	private static void addNewContact(){
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter new contact number: ");
		String number = scanner.nextLine();
		scanner.nextLine();
		Contact contact=Contact.createNewContact(name,number);
		if (mobilePhone.addNewContact(contact)){
			System.out.println("new contacted added= "+name+ "phone= "+number);
		} else {
			return;
		}
	}
	private static void updateContact(){
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		scanner.nextLine();
		Contact existingContactRecord=mobilePhone.queryContact(name);
		if (existingContactRecord==null){
			System.out.println("Couldnt get the contact");
			return;
		}
		System.out.println("enter new contact name: ");
		String newName=scanner.nextLine();
		System.out.println("enter new contact number: ");
		String newNumber=scanner.nextLine();
		Contact newContact=Contact.createNewContact(newName,newNumber);
		if (mobilePhone.updateContact(existingContactRecord,newContact)){
			System.out.println("Succesully updated record");
		} else{
			System.out.println("Error updated record");
		}

	}
	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Couldnt get the contact");
			return;
		}
		if (mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Successfully  removed");
		} else {
			System.out.println("Error removing record");
		}
	}

	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Couldnt get the contact");
			return;
		}

		System.out.println("name is "+existingContactRecord.getName()+" number is "+existingContactRecord.getPhoneNumber());

	}

}


