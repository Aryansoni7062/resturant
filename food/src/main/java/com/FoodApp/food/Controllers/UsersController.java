package com.FoodApp.food.Controllers;

import com.FoodApp.food.Services.UserService;
import com.FoodApp.food.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UsersController {

    @Autowired
    private UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }


    //create user
    @PostMapping
    public ResponseEntity<UserDto> create(
            @RequestBody UserDto userDto
    ){
        UserDto userDtoResult=userService.saveUser(userDto);
        //
        return ResponseEntity.status(HttpStatus.CREATED).body(userDtoResult);
       // return new ResponseEntity<>(userDtoResult, HttpStatus.CREATED);
    }

    //get all user
    @GetMapping
    public ResponseEntity<List<UserDto>> findAll(){
        return ResponseEntity.ok(userService.getAll());

    }

    //get by id
    @GetMapping("/{userid}")
    public ResponseEntity<UserDto> findById(@PathVariable("userId") String id){
        return ResponseEntity.ok(userService.getUserbyId(id));
    }



//    @PostMapping("/save")
//    public void getuser(){
//
//        System.out.println("saving user");
//        return ;
//    }
//
//    @RequestMapping("/")
//    @ResponseBody
//    public void Resuser(){
//
//        System.out.println("getting user");
//        return "User_List";
//    }

}
