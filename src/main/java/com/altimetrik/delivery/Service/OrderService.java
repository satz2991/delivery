package com.altimetrik.delivery.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.delivery.Entity.OrderEntity;
import com.altimetrik.delivery.Repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository repo;
	
public OrderEntity createOrder(OrderEntity order)
{
	return repo.save(order);
}

public OrderEntity updateOrder(OrderEntity order)
{
	
	return repo.save(order);
}
public void deleteOrder(OrderEntity order)
{
	
	repo.delete(order);
}
public void deleteOrderByID(Integer id)
{
	
	repo.deleteById(id);
}
}
