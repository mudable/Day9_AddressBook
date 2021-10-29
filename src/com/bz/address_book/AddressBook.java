package com.bz.address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	/*
	 * Used Scanner to take contact details from console or user added addContact
	 * details to add the details used edit contacts method to edit the existing
	 * contact details. Delete method to delete the contact
	 */
	private static final Contact con = null;
	public static Scanner sc = new Scanner(System.in);
	static ArrayList<Contact> contact1 = new ArrayList<Contact>();

	static void AddContactDetails() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no;of Contact Details you want Enter: ");
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the first_name ");
			String first_name = scan.next();
			System.out.println("Enter the last_name ");
			String last_name = scan.next();
			System.out.println("Enter the address ");
			String address = scan.next();
			System.out.println("Enter the city ");
			String city = scan.next();
			System.out.println("Enter the state");
			String state = scan.next();
			System.out.println("Enter the  ph_no ");
			int ph_no = scan.nextInt();
			System.out.println("Enter the email ");
			String email = scan.next();
			Contact contact = new Contact(first_name, last_name, address, city, state, ph_no, email);
			contact1.add(contact);
		}
	}

	public static void editContacts(String name) {
		for (Contact con : contact1) {
			if (name.equalsIgnoreCase(con.first_name)) {
				System.out.println("entered name found in the contact");
				System.out.println("Enter the updated first_name ");
				String first_name = sc.next();
				con.setFirst_name(first_name);
				System.out.println("Enter the updated last_name ");
				String last_name = sc.next();
				con.setLast_name(last_name);
				System.out.println("Enter the updated address ");
				String address = sc.next();
				con.setAddress(address);
				System.out.println("Enter the updated city ");
				String city = sc.next();
				con.setCity(city);
				System.out.println("Enter the updated state");
				String state = sc.next();
				con.setState(state);
				System.out.println("Enter the updated ph_no ");
				int ph_no = sc.nextInt();
				con.setPh_no(ph_no);
				System.out.println("Enter the updated email ");
				String email = sc.next();
				con.setEmail(email);
			} else {
				System.out.println("Name not found");
			}
		}
	}

	public static void showContacts() {
		int i = 1;
		for (Contact contact : contact1) {
			System.out.println("Details  of contact number " + i + " is");
			System.out.println(contact.toString());
			i++;
		}
	}

	public static void deleteContact(String name1) {
		for (int i = 0; i < contact1.size(); i++) {
			Contact contact = (Contact) contact1.get(i);
			if (name1.equals(contact.getFirst_name())) {
				contact.print();
				contact1.remove(i);
			}
		}
	}

	public static void main(String[] args) {
		int i = 1;
		while (i != 0) {
			System.out.println("Enter 1.To Add 2.Edit 3.Show Details 4.Delete");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				AddContactDetails();
				break;
			case 2:
				System.out.println("Enter the name to edit");
				String name = sc.next();
				editContacts(name);
				break;
			case 3:
				showContacts();
				break;
			case 4:
				System.out.println("Enter the name to delete");
				String name1 = sc.next();
				deleteContact(name1);
				break;
			default:
				System.out.println("wrong choice");
				break;
			}
		}
	}
}