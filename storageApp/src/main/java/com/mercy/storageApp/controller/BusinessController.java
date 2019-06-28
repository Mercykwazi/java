package com.mercy.storageApp.controller;

import com.mercy.storageApp.querries.Jwt;
import com.mercy.storageApp.querries.User;
import com.mercy.storageApp.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

@RestController
public class BusinessController {
    @Resource
    UserService userSev;
    private ArrayList<User> user= newArrayList();
    Jwt jwt =new Jwt();
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ArrayList<User> User() {
        System.out.println("jws: "+ jwt.getJws());
      //  System.out.println("userJwt"+jwt.getJws(user));
        return user;
    }

    @PostMapping(value="/login")
    public void postLogIn(@RequestBody User user){
        System.out.println("this is the user"+user);
  // userSev.insertOwnerDetails(user);
}
}



