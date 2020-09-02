package com.altimetrik.delivery.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.delivery.Entity.RestaurantEntity;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer>{

	RestaurantEntity findByRestaurantName(String restaurantName);
	
	List<RestaurantEntity> findByRatingGreaterThanEqual(float rating);
	
	
}
