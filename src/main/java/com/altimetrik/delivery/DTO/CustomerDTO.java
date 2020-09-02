package com.altimetrik.delivery.DTO;

import java.util.List;



public class CustomerDTO {
	private Integer customerId;
	private String name;
	private String contactNo;
	private AddressDTO address;
	private LocationDTO currentLocation;
	private List<OrderDTO> orders;
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public LocationDTO getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(LocationDTO currentLocation) {
		this.currentLocation = currentLocation;
	}
	public List<OrderDTO> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
}
