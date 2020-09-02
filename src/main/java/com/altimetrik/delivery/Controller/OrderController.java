package com.altimetrik.delivery.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.delivery.Entity.OrderEntity;
import com.altimetrik.delivery.Service.OrderService;

@RestController
@RequestMapping(value="/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping(value="/placeorder",consumes="application/json",produces="application/json")
	public OrderEntity createOrder(@RequestBody OrderEntity order)
	{
		return service.createOrder(order);
	}
	
	@PutMapping(value="/updateorder",consumes="application/json",produces="application/json")
	public OrderEntity updateOrder(@RequestBody OrderEntity order)
	{
		return service.updateOrder(order);
	}
	
	@DeleteMapping(value="/deleteorder/{id}",consumes="application/json")
	public void deleteOrderByID(@PathVariable("id")Integer id)
	{
		service.deleteOrderByID(id);
		
	}
	
	
	
}
