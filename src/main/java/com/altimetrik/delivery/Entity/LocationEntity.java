package com.altimetrik.delivery.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;



@Entity
public class LocationEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer locationId;
	@Column(nullable=false)
	@NotEmpty
	private String locationName;
	@OneToMany(mappedBy="currentLocation",cascade = CascadeType.PERSIST)
	private List<CustomerEntity> customer;
	@ManyToMany(mappedBy = "locationsServed",cascade = CascadeType.PERSIST)
	private List<RestaurantEntity> restaurants;
	
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public List<RestaurantEntity> getRestaurants() {
		return restaurants;
	}
	public void setRestaurants(List<RestaurantEntity> restaurants) {
		this.restaurants = restaurants;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	public List<CustomerEntity> getCustomer() {
		return customer;
	}
	public void setCustomer(List<CustomerEntity> customer) {
		this.customer = customer;
	}

}
