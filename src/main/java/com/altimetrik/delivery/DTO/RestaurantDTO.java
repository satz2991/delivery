package com.altimetrik.delivery.DTO;

import java.util.List;

import com.altimetrik.delivery.Entity.RestaurantEntity;



public class RestaurantDTO {

	private Integer restaurantId;
	private String restaurantName;
	private AddressDTO restaurantAddress;
	private float rating;
	private List<FoodItemDTO> foodItems;
	private List<LocationDTO> locationsServed;
	
	RestaurantDTO(RestaurantEntity entity)
	{
		this.restaurantId=entity.getRestaurantId();
		this.restaurantName=entity.getRestaurantName();
		this.rating=entity.getRating();
		
	}
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public AddressDTO getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(AddressDTO restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public List<FoodItemDTO> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<FoodItemDTO> foodItems) {
		this.foodItems = foodItems;
	}
	public List<LocationDTO> getLocationsServed() {
		return locationsServed;
	}
	public void setLocationsServed(List<LocationDTO> locationsServed) {
		this.locationsServed = locationsServed;
	}
	
	
}
