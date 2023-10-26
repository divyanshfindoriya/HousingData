package com.example.HousingData.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class HousingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long houseNumber;
    private int bedrooms;
    private float bathrooms;
    private float squareFootage;
    private String location;
    private double salePrice;

}