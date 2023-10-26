package com.example.HousingData.repository;

import com.example.HousingData.model.HousingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HousingRepository extends JpaRepository<HousingDetails,Long> {
    @Query(value = "select max(sale_price) from housing_details",nativeQuery = true)
    double getMaxPrice();
    @Query(value = "select min(sale_price) from housing_details",nativeQuery = true)
    double getMinPrice();
    @Query(value = "select location,AVG(sale_price) from housing_details group by location",nativeQuery = true)
    List<Object[]> getAvgByLocation();
    @Query(value = "select AVG(sale_price) from housing_details",nativeQuery = true)
    double getAvgOfAll();
}