package com.altimetrik.delivery.DTO;

import java.util.List;



public class FoodItemDTO {
	private Integer foodId;
	private String foodName;
	private List<RestaurantDTO> servedRestaurants;
	private int foodPrice;
	public Integer getFoodId() {
		return foodId;
	}
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public List<RestaurantDTO> getServedRestaurants() {
		return servedRestaurants;
	}
	public void setServedRestaurants(List<RestaurantDTO> servedRestaurants) {
		this.servedRestaurants = servedRestaurants;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
}
