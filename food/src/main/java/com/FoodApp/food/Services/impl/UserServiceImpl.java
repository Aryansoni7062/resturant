package com.FoodApp.food.Services.impl;

import com.FoodApp.food.Exceptation.UserNotFound;
import com.FoodApp.food.Services.UserService;
import com.FoodApp.food.dto.UserDto;
import com.FoodApp.food.entity.Role;
import com.FoodApp.food.entity.RoleEntity;
import com.FoodApp.food.entity.User;
import com.FoodApp.food.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.UnmodifiableSetException;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;



    @Override
    public UserDto saveUser(UserDto userDto) {

        userDto.setId(UUID.randomUUID().toString());

        User user=ConvertUserDtoToUser(userDto);

        User saveduser=userRepo.save(user);


        return ConvertUserToUserDto(saveduser);

    }

    @Override
    public UserDto updateUser(UserDto userDto, String userId) {
        return null;
    }

    @Override
    public List<UserDto> getAll() {

        List<User> users=userRepo.findAll();
        List<UserDto> userDtos=users
                .stream().map((user)-> ConvertUserToUserDto(user)).toList();

        return userDtos;
    }

    @Override
    public List<UserDto> getuserbyName(String Name) {
        //List<User> users=userRepo.findBy(Name);
        return List.of();
    }

    @Override
    public List<UserDto> getUserbyemail(String email) {
        return List.of();
    }

    @Override
    public UserDto getUserbyId(String userId) {
        System.out.println("Service is working");
        User users=userRepo.findById(userId)
                .orElseThrow(()-> new UserNotFound("user not found"));

        return ConvertUserToUserDto(users);
    }

    @Override
    public void deleteUser(String userId) {

    }

    //custom query banana padega repo me
    @Override
    public List<UserDto> SearchUserName(String keyword) {
//        List<User> users=userRepo.findBy(keyword);
//        UserDto  userDto=users.stream().map((user) ->ConvertUserDtoToUser(user)).toList();

        return List.of();
    }




    private User ConvertUserDtoToUser(UserDto userDto){
        User user=new User();
        user.setId(userDto.getId());
        user.setAddress(userDto.getAddress());
        user.setName(user.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(user.getPassword());
        user.setPhoneNumber(user.getPhoneNumber());

        return user;
    }

    private UserDto ConvertUserToUserDto(User user){
        UserDto userDto=new UserDto();

        userDto.setId(user.getId());
        userDto.setAddress(user.getAddress());
        userDto.setName(user.getName());
        userDto.setPassword(user.getPassword());
        userDto.setEmail(user.getEmail());
        userDto.setPhoneNumber(user.getPhoneNumber());

        return userDto;

    }
}
