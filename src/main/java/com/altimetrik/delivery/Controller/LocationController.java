package com.altimetrik.delivery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.delivery.DTO.LocationDTO;
import com.altimetrik.delivery.Entity.RestaurantEntity;
import com.altimetrik.delivery.Service.LocationService;

@RestController
@RequestMapping("/location")
public class LocationController {

	@Autowired
	private LocationService service;
	
	@GetMapping(value="/find/{locationname}",produces ="application/json")
	@ResponseBody
	private LocationDTO getLocationByName(@PathVariable("locationname") String name)
	{
			
		return service.getLocationByName(name);
		
		
	}
	
	@PostMapping(value="/add/{locationname}",produces ="application/json" )
	@ResponseBody
	private LocationDTO createLocationByName(@PathVariable("locationname") String name)
	{
		
		return service.createLocationByName(name);
		
	}
	@GetMapping(value="/findrestaurants/{locationname}",produces ="application/json")
	@ResponseBody
	private List<RestaurantEntity> getRestaurantsByLocationName(@PathVariable("locationname") String name)
	{
			
		return service.getRestaurantsByLocationName(name);//restaurants can be filtered based on rating in frontend as the end user may change rating rapidly
		
		
	}
	
	
}
