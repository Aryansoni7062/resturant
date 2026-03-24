package com.FoodApp.food.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Table(name="foodie_resturant")
@Data
@Builder
public class Restaurant {
    @Id
    private String id;
    private String name;
    @Lob
    private String description;
    private String address;
    private LocalTime openTime;
    private LocalTime closeTime;
    private boolean isopen=true;
    private String  banner;


    @ManyToOne
    private User user;
}
