package com.FoodApp.food.Services;

import com.FoodApp.food.dto.RestaurantDto;

import java.util.List;

public interface RestaurantService {



    RestaurantDto addrest(RestaurantDto restaurantDto);

    RestaurantDto updaterest(RestaurantDto restaurantDto,String id);

    List<RestaurantDto> getAllRest();

    RestaurantDto getById(String id);

    void deleterest(String id);

    List<RestaurantDto> searchByName(String keyword);
}
