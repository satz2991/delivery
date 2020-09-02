package com.altimetrik.delivery.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.delivery.Entity.FoodItemEntity;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItemEntity, Integer>{
	public FoodItemEntity findByFoodName(String name);

}
