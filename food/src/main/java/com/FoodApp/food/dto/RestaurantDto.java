package com.FoodApp.food.dto;

import jakarta.persistence.Lob;
import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantDto {

    private String id;
    private String name;

    private String description;
    private String address;
    private LocalTime openTime;
    private LocalTime closeTime;
   //private boolean isopen=true;
    private String  banner;
}
