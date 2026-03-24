package com.FoodApp.food.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="foodie_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private String id;

    private String name;

    private String email;

    private String password;

    private String address;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean isAvailabe=true;//applicabe for delivery boy

    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL,orphanRemoval = true)
    private List<Restaurant> resturant=new ArrayList<>();



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private List<RoleEntity> roleEntities=new ArrayList<>();
}
