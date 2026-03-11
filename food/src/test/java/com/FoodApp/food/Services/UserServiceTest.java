package com.FoodApp.food.Services;

import com.FoodApp.food.Services.impl.UserServiceImpl;
import com.FoodApp.food.entity.Resturant;
import com.FoodApp.food.entity.Role;
import com.FoodApp.food.entity.RoleEntity;
import com.FoodApp.food.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;
@SpringBootTest
public class UserServiceTest {
    @Autowired

    public UserServiceImpl userServiceimpl;
    @Test
    public void testSaveUser(){
        System.out.println("i am working");
        userServiceimpl.testUserRole();


       /* User user=new User();
        user.setName("Aryan");
        user.setEmail("Aryan@15");
        user.setAvailabe(true);
        user.setAddress("lucknow");
        user.setPassword("abc");
        user.setRole(Role.ADMIN);

        Resturant resturant=new Resturant();
         resturant.setId(UUID.randomUUID().toString());
         resturant.setName("kfc");
         resturant.setAddress("lucknow");
         resturant.setIsopen(true);

        Resturant resturant1=new Resturant();
        resturant1.setId(UUID.randomUUID().toString());
        resturant1.setName("burgerking");
        resturant1.setAddress("lucknow");
        resturant1.setIsopen(true);

         User saved= userServiceimpl.saveuser(user);
         System.out.println(saved.getName());

        RoleEntity roleEntity=new RoleEntity();
        roleEntity.setName("guest");
        RoleEntity roleEntity1=new RoleEntity();
        roleEntity1.setName("guest");

        user.getRoleEntities().add(roleEntity);
        user.getRoleEntities().add(roleEntity1);

        roleEntity.getUsers().add(user);
        roleEntity1.getUsers().add(user);*/




    }


}
