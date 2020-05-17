package com.carona.restproject.controller;

import java.net.URI;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id)
	{
		return customerService.getCustomerbyId(id);
	}
	
	@PostMapping("/customers")
	public ResponseEntity<Object> createCustomer(@RequestBody Customer customer)
	{	
		Customer savedCustomer = customerService.save(customer);
		
		URI location = ServletUriComponentsBuilder.
						fromCurrentRequest().
						path("/{id}").
						buildAndExpand(savedCustomer.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	


}
