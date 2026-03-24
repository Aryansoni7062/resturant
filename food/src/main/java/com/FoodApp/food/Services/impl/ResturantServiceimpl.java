package com.FoodApp.food.Services.impl;

import com.FoodApp.food.Services.RestaurantService;
import com.FoodApp.food.dto.RestaurantDto;
import com.FoodApp.food.entity.Restaurant;
import com.FoodApp.food.repository.RestaurantRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ResturantServiceimpl implements RestaurantService {


    private RestaurantRepo restaurantRepo;

    private ModelMapper modelMapper;
    public ResturantServiceimpl(RestaurantRepo restaurantRepo, ModelMapper modelMapper) {
        this.restaurantRepo = restaurantRepo;
        this.modelMapper = modelMapper;
    }



    @Override
    public RestaurantDto addrest(RestaurantDto restaurantDto) {
        restaurantDto.setId(UUID.randomUUID().toString());
        Restaurant restaurant=modelMapper.map(restaurantDto,Restaurant.class);
        Restaurant saved=restaurantRepo.save(restaurant);


        return modelMapper.map(saved,RestaurantDto.class);
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
