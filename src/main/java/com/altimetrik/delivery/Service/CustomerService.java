package com.altimetrik.delivery.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.delivery.Entity.CustomerEntity;
import com.altimetrik.delivery.Entity.OrderEntity;
import com.altimetrik.delivery.Repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	public CustomerRepository repo;
public CustomerEntity  createCustomer(CustomerEntity customer)
{

	return repo.save(customer);	
}

public CustomerEntity updateCustomer(CustomerEntity customer)
{
	return repo.save(customer);
}

public List<OrderEntity> getOrders(Integer id)
{
	
	List<OrderEntity> list;
	
	Optional<CustomerEntity> customer =repo.findById(id);
	if(customer.isPresent())
		list=customer.get().getOrders();
	else
		list=new ArrayList<OrderEntity>();
	
	return list;
}
}
