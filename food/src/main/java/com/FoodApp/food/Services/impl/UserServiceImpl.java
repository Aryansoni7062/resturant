package com.FoodApp.food.Services.impl;

import com.FoodApp.food.Services.UserService;
import com.FoodApp.food.entity.Role;
import com.FoodApp.food.entity.RoleEntity;
import com.FoodApp.food.entity.User;
import com.FoodApp.food.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    public UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }



    @Override
    public User saveuser(User user){
        user.setId(UUID.randomUUID().toString());
       User savedentity= userRepo.save(user);

        return savedentity;
    }
    @Override
    public void testUserRole(){
        User user=new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("Aryan");
        user.setEmail("Aryan@15");
        user.setAvailabe(true);
        user.setAddress("lucknow");
        user.setPassword("abc");

        RoleEntity roleEntity=new RoleEntity();
        roleEntity.setName("guest");
        RoleEntity roleEntity1=new RoleEntity();
        roleEntity1.setName("guest");

        user.getRoleEntities().add(roleEntity);
        user.getRoleEntities().add(roleEntity1);

        roleEntity.getUsers().add(user);
        roleEntity1.getUsers().add(user);
    userRepo.save(user);

    System.out.println("user saved");
    }


}
