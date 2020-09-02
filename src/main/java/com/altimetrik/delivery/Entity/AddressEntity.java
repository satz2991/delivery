package com.altimetrik.delivery.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class AddressEntity {
	private String doorNo;
	private String fullAddress;
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	

}
