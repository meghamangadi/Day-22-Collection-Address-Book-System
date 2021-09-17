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
		System.out.println("Enter your choice");
		System.out.println("1 : Add new contact    2 : Edit contact ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
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
			System.out.println("Enter the Email Id");
			String email = sc.next();
			ContactPerson contact = new ContactPerson(firstName, lastName, address, city, state, zip, phone, email);
			List<ContactPerson> contactList = new ArrayList<>();
			contactList.add(contact);
			addressBook.setContacts(contactList);
			displayContacts(addressBook);
			addContactDetails();
			break;
		case 2:

			System.out.println("Enter the  Name");
			String name = sc.next();
			System.out.println("Enter the person Name");
			String editFirstName = sc.next();
			System.out.println("Enter the Last Name");
			String editLastName = sc.next();
			System.out.println("Enter The Address");
			String editAddress = sc.next();
			System.out.println("Enter the city");
			String editCity = sc.next();
			System.out.println("Enter the state");
			String editState = sc.next();
			System.out.println("Enter the zip Code");
			int editzip = sc.nextInt();
			System.out.println("Enter the Phone number");
			long editPhone = sc.nextLong();
			System.out.println("Enter the Email Id");
			String editemail = sc.next();
			editContact(name,editFirstName, editLastName, editAddress, editCity, editState, editzip, editPhone, editemail);
			addContactDetails();
			sc.close();
			break;
		default : 
			System.out.println("Please Enter correct choice"); 
			
		}
	}

	public static void editContact(String name,String editFirstName, String lastname, String address, String city, String state, int zip,
			long phone, String email) {
		List<ContactPerson> contactDetails = addressBook.getContacts();
		for (int i = 0; i <= contactDetails.size() - 1; i++) {

			ContactPerson contactperson = contactDetails.get(i);
			if (contactperson.getFirstName().equals(name)) {

				contactperson.setAddress(address);
				contactperson.setCity(city);
				contactperson.setFirstName(editFirstName);
				contactperson.setLastName(lastname);
				contactperson.setPhone(phone);
				contactperson.setState(state);
				contactperson.setZip(zip);
				contactperson.setEmail(email);
				contactDetails.set(i, contactperson);
				addressBook.setContacts(contactDetails);
			}
		}
		displayContacts(addressBook);
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
