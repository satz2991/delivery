package com.altimetrik.delivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.delivery.Entity.CustomerEntity;
import com.altimetrik.delivery.Entity.OrderEntity;
import com.altimetrik.delivery.Service.CustomerService;

@RestController
@RequestMapping(value="/Customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping(value="/createcustomer",consumes="application/json",produces="application/json")
	public CustomerEntity createCustomer(@RequestBody CustomerEntity customer)
	{
		return service.createCustomer(customer);
		
		
		
	}
	
	@PutMapping(value="/updatecustomer",consumes="application/json",produces="application/json")
	public CustomerEntity updateCustomer(@RequestBody CustomerEntity customer)
	{
		return service.updateCustomer(customer);
	}
	
	@GetMapping(value="/getorders/{customerid}",produces="application/json")
	public List<OrderEntity> getOrdersByCustomerID(@PathVariable("customerid") Integer id)
	{
		return service.getOrders(id);
	}
}
