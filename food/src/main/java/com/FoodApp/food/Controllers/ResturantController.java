package com.FoodApp.food.Controllers;


import com.FoodApp.food.Services.RestaurantService;
import com.FoodApp.food.dto.RestaurantDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Restaurant")
public class ResturantController {


    RestaurantService restaurantService;

    public ResturantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    @PostMapping
   public ResponseEntity <RestaurantDto> Saverest(
            @RequestBody RestaurantDto restaurantDto
    ){
        RestaurantDto restresult=restaurantService.addrest(restaurantDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(restresult);
    }
}
