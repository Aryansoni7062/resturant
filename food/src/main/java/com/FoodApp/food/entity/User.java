package com.FoodApp.food.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;
import org.springframework.data.util.Lazy;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="foodie_user")
@Getter
@Setter
public class User {
    @Id
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isAvailabe() {
        return isAvailabe;
    }

    public void setAvailabe(boolean availabe) {
        isAvailabe = availabe;
    }

    public List<Resturant> getResturant() {
        return resturant;
    }

    public void setResturant(List<Resturant> resturant) {
        this.resturant = resturant;
    }

    private String name;

    private String email;

    private String password;

    private String address;

    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean isAvailabe=true;//applicabe for delivery boy

    @OneToMany(mappedBy = "user", cascade=CascadeType.ALL,orphanRemoval = true)
    private List<Resturant> resturant=new ArrayList<>();

    public List<RoleEntity> getRoleEntities() {
        return roleEntities;
    }

    public void setRoleEntities(List<RoleEntity> roleEntities) {
        this.roleEntities = roleEntities;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private List<RoleEntity> roleEntities=new ArrayList<>();
}
