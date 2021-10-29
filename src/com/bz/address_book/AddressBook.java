package com.bz.address_book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	/* Used Scanner to take contact details from console or user */
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
		}
	}

	public static void editContacts(String name) {
		Scanner sc = new Scanner(System.in);
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

	public static void main(String[] args) {
		AddContactDetails();
	}
}
