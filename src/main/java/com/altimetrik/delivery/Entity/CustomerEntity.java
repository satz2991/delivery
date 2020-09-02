package com.altimetrik.delivery.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;





@Entity
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer customerId;
	private String Name;
	@Column(unique = true,nullable=false)
	@NotEmpty
	private String email;
	private String ContactNo;
	private AddressEntity address;
	@ManyToOne
	private LocationEntity currentLocation;
	@OneToMany(mappedBy="customer")
	private List<OrderEntity> orders;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressEntity getAddress() {
		return address;
	}
	public void setAddress(AddressEntity address) {
		this.address = address;
	}
	public LocationEntity getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(LocationEntity currentLocation) {
		this.currentLocation = currentLocation;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public List<OrderEntity> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}

}
