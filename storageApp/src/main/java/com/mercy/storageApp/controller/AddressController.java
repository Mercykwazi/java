package com.mercy.storageApp.controller;

import com.mercy.storageApp.querries.Address;
import com.mercy.storageApp.service.LocationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

@RestController
public class AddressController {
    @Resource
    LocationService locationSev;

    @GetMapping("/location")
    public List<Address> getLocations() {
        System.out.println("when this is called I will be happy"+locationSev.findAll());
        return locationSev.findAll();
    }

    @PostMapping(value = "/location")
    public void postLocation(@RequestBody Address loc) {
        System.out.println("what is location loc" + loc);
        locationSev.insertLocation(loc);
    }


    //    @Resource
//    UserService userService;
//    @RequestMapping("/login")
//    @GetMapping
//    public String logIn() {
//        return "you have logged in";
//    }
}


