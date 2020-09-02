package com.altimetrik.delivery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.delivery.DTO.LocationDTO;
import com.altimetrik.delivery.Entity.LocationEntity;
import com.altimetrik.delivery.Entity.RestaurantEntity;
import com.altimetrik.delivery.Repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository repo;
	
	public LocationDTO getLocationByName(String name)
	{
		
		LocationEntity location=repo.findByLocationName(name);
		LocationDTO dto=new LocationDTO();
		//dto.setCustomer(location.getCustomer());
		dto.setLocationId(location.getLocationId());
		dto.setLocationName(location.getLocationName());
		//dto.setRestaurants(location.getRestaurants());
		return dto;
		
		
	}
	public LocationDTO createLocationByName(String name)
	{
		LocationEntity location=new LocationEntity();
		location.setLocationName(name);
		LocationDTO dto=new LocationDTO();
		location=repo.save(location);
		dto.setLocationName(location.getLocationName());
		dto.setLocationId(location.getLocationId());
		return dto;
		
		
	}
	
	public List<RestaurantEntity> getRestaurantsByLocationName(String name)
	{
		
		return repo.findByLocationName(name).getRestaurants();
		
	}
}
