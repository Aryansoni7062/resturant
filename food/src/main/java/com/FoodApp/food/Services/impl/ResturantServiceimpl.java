package com.FoodApp.food.Services.impl;

import com.FoodApp.food.Services.RestaurantService;
import com.FoodApp.food.dto.RestaurantDto;
import com.FoodApp.food.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResturantServiceimpl implements RestaurantService {
    @Autowired
    private RestaurantRepo restaurantRepo;

    @Override
    public RestaurantDto addrest(RestaurantDto restaurantDto) {

        return null;
    }

    @Override
    public RestaurantDto updaterest(RestaurantDto restaurantDto, String id) {
        return null;
    }

    @Override
    public List<RestaurantDto> getAllRest() {
        return List.of();
    }

    @Override
    public RestaurantDto getById(String id) {
        return null;
    }

    @Override
    public void deleterest(String id) {

    }

    @Override
    public List<RestaurantDto> searchByName(String keyword) {
        return List.of();
    }
}
