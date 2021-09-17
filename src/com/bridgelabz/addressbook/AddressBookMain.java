package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
	public static AddressBook addressBook = new AddressBook();

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program\n");
		addContactDetails();
	}

	public static void addContactDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("  Add new contact ");
		System.out.println("Enter the First Name");
		String firstName = sc.next();
		System.out.println("Enter the Last Name");
		String lastName = sc.next();
		System.out.println("Enter The Address");
		String address = sc.next();
		System.out.println("Enter the city");
		String city = sc.next();
		System.out.println("Enter the state");
		String state = sc.next();
		System.out.println("Enter the zip Code");
		int zip = sc.nextInt();
		System.out.println("Enter the Phone number");
		long phone = sc.nextLong();
		System.out.println("Enter the Email");
		String email = sc.next();
		ContactPerson contact = new ContactPerson(firstName, lastName, address, city, state, zip, phone, email);
		List<ContactPerson> contactList = new ArrayList<>();
		contactList.add(contact);
		addressBook.setContacts(contactList);
		displayContacts(addressBook);

		sc.close();

	}

	public static void displayContacts(AddressBook addressBook) {
		List<ContactPerson> contactDetails = addressBook.getContacts();

		for (int i = 0; i <= contactDetails.size() - 1; i++) {
			ContactPerson contactperson = contactDetails.get(i);
			if (!contactperson.getFirstName().equals("")) {
				System.out.println("Conatct Details :");
				System.out.println("FirstName :" + contactperson.getFirstName() + "      LastName :"
						+ contactperson.getLastName() + "     Address :" + contactperson.getAddress() + "      City :"
						+ contactperson.getCity() + "       State :" + contactperson.getState() + "     Zip :"
						+ contactperson.getZip() + "     Phone Number :" + contactperson.getPhone() + "    Email Id :"
						+ contactperson.getEmail());
			} else {

				System.out.println("No Conatct Details available :");
			}
		}

	}

}
