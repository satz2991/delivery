package com.altimetrik.delivery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.delivery.Entity.FoodItemEntity;
import com.altimetrik.delivery.Entity.LocationEntity;
import com.altimetrik.delivery.Entity.RestaurantEntity;
import com.altimetrik.delivery.Repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepository repo;

	public RestaurantEntity findRestaurantByName(String name)
	{
		return repo.findByRestaurantName(name);
		
		
		
	}
	
	public RestaurantEntity createRestaurantByName(String name)
	{
		RestaurantEntity restaurant=new RestaurantEntity();
		restaurant.setRestaurantName(name);
		return repo.save(restaurant);
		
	}
	
	public RestaurantEntity createRestaurant(RestaurantEntity restaurant)
	{	
		
		return repo.save(restaurant);
		
	}
	
	public List<RestaurantEntity> findByRatingGreaterThanEqual(float rating)
	{
		
		return repo.findByRatingGreaterThanEqual(rating);
	}
	
	public List<FoodItemEntity>findFoodsByRestaurantName(String name){
		
		return repo.findByRestaurantName(name).getFoodItems();
	}
}
