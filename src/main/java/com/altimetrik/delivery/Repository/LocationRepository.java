package com.altimetrik.delivery.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altimetrik.delivery.Entity.LocationEntity;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Integer>{
	
	LocationEntity findByLocationName(String locationName);
	

	
}
