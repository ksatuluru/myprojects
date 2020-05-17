package com.carona.restproject.service;

import org.springframework.stereotype.Service;

import com.carona.restproject.beans.Customer;

import java.util.*;

@Service
public class CustomerService {
	
	private HashMap<Integer, Customer> customers = new HashMap<Integer, Customer> ();
	
	public CustomerService()
	{
		super();
		loadCustomers();
	}
	
	public void loadCustomers()
	{
		System.out.println("loadCustomer");
		addCustomer(new Customer(1, "Kamal", "Satuluru", "325 Lahontan Pass", "Johns Creek", "GA", "300024"));
		addCustomer(new Customer(2, "Namrata", "Sangubhat", "323 jilebi Pass", "Johns ", "TX", "300025"));
		addCustomer(new Customer(3, "Siddharth", "Satuluru1", "327 Santa Monica", "Westwood", "LA", "300026"));
		addCustomer(new Customer(4, "Supraja", "Satuluru2", "328 Lahontan Pass", "Johns Creek", "NY", "300027"));
		addCustomer(new Customer(5, "Leo", "Satuluru3", "329 Lahontan Pass", "Suwanee", "NC", "900028"));
	}
	public void addCustomer(Customer customer)
	{
		customers.put(customer.getId(), customer);
	}
	
	public Customer getCustomerbyId(int id)
	{
		return customers.get(id);
	}
	
	public Collection<Customer> getAllCustomers()
	{
		return customers.values();
	}
	public int getNextCustomerNumber()
	{
		return getAllCustomers().size();
	}
	
	public Customer save(Customer customer)
	{
		int idx = getNextCustomerNumber()+1;
		customer.setId(idx);
		customers.put(customer.getId(), customer);
		return customer;
	}
}
