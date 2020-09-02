package com.altimetrik.delivery.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;



@Entity
public class RestaurantEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer restaurantId;
@Column(unique = true,nullable=false)
@NotEmpty
private String restaurantName;
private AddressEntity restaurantAddress;
private float rating;
@ManyToMany
private List<FoodItemEntity> foodItems = new ArrayList<FoodItemEntity>();;
@ManyToMany(cascade = CascadeType.PERSIST)
private List<LocationEntity> locationsServed = new ArrayList<LocationEntity>();

public String getRestaurantName() {
	return restaurantName;
}
public void setRestaurantName(String restaurantName) {
	this.restaurantName = restaurantName;
}
public AddressEntity getRestaurantAddress() {
	return restaurantAddress;
}
public void setRestaurantAddress(AddressEntity restaurantAddress) {
	this.restaurantAddress = restaurantAddress;
}
public List<LocationEntity> getLocationsServed() {
	return locationsServed;
}
public void setLocationsServed(List<LocationEntity> locationsServed) {
	this.locationsServed = locationsServed;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	this.rating = rating;
}
public List<FoodItemEntity> getFoodItems() {
	return foodItems;
}
public void setFoodItems(List<FoodItemEntity> foodItems) {
	this.foodItems = foodItems;
}
public Integer getRestaurantId() {
	return restaurantId;
}
public void setRestaurantId(Integer restaurantId) {
	this.restaurantId = restaurantId;
}

}
