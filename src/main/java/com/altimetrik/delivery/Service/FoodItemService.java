package com.altimetrik.delivery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.delivery.Entity.FoodItemEntity;
import com.altimetrik.delivery.Entity.RestaurantEntity;
import com.altimetrik.delivery.Repository.FoodItemRepository;

@Service
public class FoodItemService {

	@Autowired
	private FoodItemRepository repo;
	
	public FoodItemEntity getFoodItemByName(String name)
	{
		return repo.findByFoodName(name);
	}
	
	public List<RestaurantEntity> getRestaurantsByFoodItemName(String name)
	{
		return repo.findByFoodName(name).getServedRestaurants();
	}
	public FoodItemEntity createFoodItem(FoodItemEntity food)
	{
		
		return repo.save(food);
	}
}
