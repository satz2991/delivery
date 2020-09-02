package com.altimetrik.delivery.DTO;

import java.util.List;

public class LocationDTO {
	private Integer locationId;
	private String locationName;
	private List<CustomerDTO> customer;
	private List<RestaurantDTO> restaurants;
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public List<CustomerDTO> getCustomer() {
		return customer;
	}
	public void setCustomer(List<CustomerDTO> customer) {
		this.customer = customer;
	}
	public List<RestaurantDTO> getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(List<RestaurantDTO> restaurants) {
		this.restaurants = restaurants;
	}
	
	
}
