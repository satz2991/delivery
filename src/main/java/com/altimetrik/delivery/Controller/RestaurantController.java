package com.altimetrik.delivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.delivery.Entity.FoodItemEntity;
import com.altimetrik.delivery.Entity.RestaurantEntity;
import com.altimetrik.delivery.Service.RestaurantService;

@RestController
@RequestMapping(value="/restaurant")
public class RestaurantController {

	@Autowired
	private RestaurantService service;
	
	@GetMapping(value="/find/{restaurantname}",produces="application/json")
	public RestaurantEntity findRestaurantByName(@PathVariable("restaurantname") String name)
	{
		return service.findRestaurantByName(name);
			
	}
	@GetMapping(value="/findbyrating/{rating}",produces="application/json")
	public List<RestaurantEntity>findRestaurantByRating(@PathVariable("rating") float rating)
	{
	return service.findByRatingGreaterThanEqual(rating);
	}
	@GetMapping(value="/findfoods/{restaurantname}",produces="application/json")
	public List<FoodItemEntity> findFoodsByRestaurantName(@PathVariable("restaurantname") String name)
	{
		return service.findFoodsByRestaurantName(name);
			
	}
	
	
	@PostMapping(value="/add/{restaurantname}",produces="application/json")
	public RestaurantEntity createRestaurantByName(@PathVariable("restaurantname") String name)
	{
		return service.createRestaurantByName(name);
		
	}
	
	@PostMapping(value="/add",consumes="application/json",produces="application/json")
	public RestaurantEntity createRestaurant(@RequestBody RestaurantEntity restaurant)
	{
		
		return service.createRestaurant(restaurant);
		
	}
	
}
