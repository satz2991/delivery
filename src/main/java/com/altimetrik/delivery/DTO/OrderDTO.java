package com.altimetrik.delivery.DTO;

import java.sql.Date;
import java.util.List;


public class OrderDTO {
	private Integer orderId;
	private CustomerDTO customer;
	private RestaurantDTO restaurant;
	private Date orderDate;
	private String orderStatus;
	private List<FoodItemDTO> foodItems;
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public RestaurantDTO getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(RestaurantDTO restaurant) {
		this.restaurant = restaurant;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public List<FoodItemDTO> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<FoodItemDTO> foodItems) {
		this.foodItems = foodItems;
	}
	
	
}
