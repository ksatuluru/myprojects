package com.carona.restproject.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.carona.restproject.beans.Customer;
import com.carona.restproject.service.CustomerService;

@RestController
public class CustomerController {
	
	//@Autowired 
	private CustomerService customerService = new CustomerService();
	
	@GetMapping("/customers")
	public Collection<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}

	@GetMapping("/customers/{lName}")
	public Customer getCustomer(@PathVariable String lName)
	{
		return customerService.getCustomerbylName(lName);
	}

}
