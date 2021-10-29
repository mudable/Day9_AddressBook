package com.bz.address_book;

public class Contact {
	 @Override
	public String toString() {
		return "Contact [first_name=" + first_name + ", last_name=" + last_name + ", address=" + address + ", city="
				+ city + ", state=" + state + ", ph_no=" + ph_no + ", email=" + email + "]";
	}

	String first_name;
	String last_name;
	String address;
	String city;
	String state;
	int ph_no;
	String email;

	public Contact(String first_name, String last_name, String address, String city, String state, int ph_no2,
			String email) {

		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.ph_no = ph_no2;
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPh_no() {
		return ph_no;
	}

	
	public void setPh_no(int ph_no) {
		this.ph_no = ph_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}