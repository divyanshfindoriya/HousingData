package com.example.HousingData.controller;


import com.example.HousingData.model.HousingDetails;
import com.example.HousingData.service.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("housing")
public class HousingController {
    @Autowired
    HousingService housingService;
    @PostMapping("save")
    public List<HousingDetails> save(@RequestBody List<HousingDetails> h){
        return housingService.saveHouse(h);
    }
    @GetMapping("getAll")
    public List<HousingDetails> getAll(){
        return housingService.getAll();
    }
    @GetMapping("getAvgOfAll")
    public double getAvgOfAll(){
        return housingService.getAvgOfAll();
    }
    @GetMapping("getAvgByLocation")
    public List<Object[]> getAvgByLocation(){
        return housingService.getAvgByLocation();
    }
    @GetMapping("getMaxSale")
    public double getMaxSale(){
        return housingService.getMaxSale();
    }
    4@GetMapping("getMinSale")
    public double getMinSale(){
        return housingService.getMinSale();
    }
}