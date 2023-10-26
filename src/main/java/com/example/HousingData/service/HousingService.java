package com.example.HousingData.service;

import com.example.HousingData.model.HousingDetails;
import com.example.HousingData.repository.HousingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class HousingService {
    @Autowired
    HousingRepository housingRepository;
    public List<HousingDetails> saveHouse(List<HousingDetails>housingDetails){
        return housingRepository.saveAll(housingDetails);
    }
    public List<HousingDetails> getAll(){
        return housingRepository.findAll();
    }

    public double getAvgOfAll(){
/*
        List<HousingDetails> housingDetails = housingRepository.findAll();
        double sum = 0;
        for(HousingDetails housingDetails1:housingDetails){
            sum += housingDetails1.getSalePrice();
        }
        return sum/housingDetails.size();
*/
        return housingRepository.getAvgOfAll();
    }

    public List<Object[]> getAvgByLocation() {
/*
        List<AvgPerLocation> avgPerLocations = new ArrayList<>();
        List<HousingDetails> housingData = housingRepository.findAll();
        Set<String> locations = new HashSet<>();
        for (HousingDetails housingData1:housingData)locations.add(housingData1.getLocation());
        for (String location : locations){
            int price = 0,totalLocation = 0;
            for (HousingDetails housingData1:housingData){
                if (housingData1.getLocation().equals(location)){
                    price += housingData1.getSalePrice();
                    totalLocation++;
                }
            }
            AvgPerLocation avgPerLocation = AvgPerLocation.builder().location(location).min((double)price/totalLocation).build();
            avgPerLocations.add(avgPerLocation);
        }
*/
        return housingRepository.getAvgByLocation();
    }
    public double getMaxSale(){
        return housingRepository.getMaxPrice();
    }
    public double getMinSale(){
        return housingRepository.getMinPrice();
    }
}
