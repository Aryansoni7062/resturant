package com.FoodApp.food.Services;

import com.FoodApp.food.dto.UserDto;
import com.FoodApp.food.entity.User;

import java.util.List;

public interface UserService {

     UserDto saveUser(UserDto userDto);

     UserDto updateUser(UserDto userDto,String userId);

     List<UserDto> getAll();

     List<UserDto> getuserbyName(String Name);

     List<UserDto> getUserbyemail(String email);

     UserDto getUserbyId(String userId);

     void deleteUser(String userId);

     List<UserDto> SearchUserName(  String keyword);




}
