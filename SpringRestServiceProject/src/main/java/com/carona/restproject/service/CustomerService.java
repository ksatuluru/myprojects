package com.carona.restproject.service;

import org.springframework.stereotype.Service;

import com.carona.restproject.beans.Customer;

import java.util.*;

@Service
public class CustomerService {
	
	private HashMap<String, Customer> customers = new HashMap<String, Customer>();
	
	public CustomerService()
	{
		super();
		loadCustomers();
	}
	
	public void loadCustomers()
	{
		System.out.println("loadCustomer");
		addCustomer(new Customer("Kamal", "Satuluru", "325 Lahontan Pass", "Johns Creek", "GA", "300024"));
		addCustomer(new Customer("Namrata", "Sangubhat", "323 jilebi Pass", "Johns ", "TX", "300025"));
		addCustomer(new Customer("Siddharth", "Satuluru1", "327 Santa Monica", "Westwood", "LA", "300026"));
		addCustomer(new Customer("Supraja", "Satuluru2", "328 Lahontan Pass", "Johns Creek", "NY", "300027"));
		addCustomer(new Customer("Leo", "Satuluru3", "329 Lahontan Pass", "Suwanee", "NC", "900028"));
	}
	public void addCustomer(Customer customer)
	{
		customers.put(customer.getlName().toLowerCase(), customer);
	}
	
	public Customer getCustomerbylName(String lName)
	{
		return customers.get(lName.toLowerCase());
	}
	
	public Collection<Customer> getAllCustomers()
	{
		return customers.values();
	}
}
