package com.FoodApp.food.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Table(name="foodie_resturant")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    @Builder.Default

    @Column(name="isopen")
    private boolean isopen=true;
    private String  banner;


    @ManyToOne
    private User user;
}
