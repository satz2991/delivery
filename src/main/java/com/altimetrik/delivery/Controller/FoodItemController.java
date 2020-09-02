package com.altimetrik.delivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.delivery.Entity.FoodItemEntity;
import com.altimetrik.delivery.Entity.RestaurantEntity;
import com.altimetrik.delivery.Service.FoodItemService;

@RestController
@RequestMapping(value = "/fooditem")
public class FoodItemController {

	@Autowired
	private FoodItemService service;
	
	@GetMapping(value="/getfoodbyname/{name}",produces = "application/json")
	public FoodItemEntity getFoodItemByName(@PathVariable("name") String name)
	{
		return service.getFoodItemByName(name);
		
	}
	
	@GetMapping(value="/getrestaurantsbyfoodname/{name}",produces = "application/json")
	public List<RestaurantEntity> getRestaurantsByFoodItemName(@PathVariable("name") String name)
	{
		return service.getRestaurantsByFoodItemName(name);
		
	}
	
	@PostMapping(value="/add",consumes="application/json",produces="application/json")
	public FoodItemEntity createFoodItem(@RequestBody FoodItemEntity food)
	{	
		
		service.createFoodItem(food);
		return food;
		
		
	}
	
	
}
