package com.altimetrik.delivery.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class FoodItemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer foodId;
	@Column(unique = true,nullable=false)
	@NotEmpty
	private String foodName;
	@ManyToMany(mappedBy = "foodItems")
	private List<RestaurantEntity> servedRestaurants;
	private int foodPrice;
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public List<RestaurantEntity> getServedRestaurants() {
		return servedRestaurants;
	}
	public void setServedRestaurants(List<RestaurantEntity> servedRestaurants) {
		this.servedRestaurants = servedRestaurants;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public Integer getFoodId() {
		return foodId;
	}
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

}
