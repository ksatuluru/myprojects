package com.carona.restproject.beans;


public class Customer {
	
	public int    id;
	
	public String fName;
	public String lName;
	public String addressLine1;
	public String city;
	public String state;
	public String zip;
	
	public Customer()
	{
		
	}
	
	public Customer(int id, String fName, String lName, String addressLine1, String city, String state, String zip)
	{
		setId(id);
		setfName(fName);
		setlName(lName);
		setAddressLine1(addressLine1);
		setCity(city);
		setState(state);
		setZip(zip);
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
}
