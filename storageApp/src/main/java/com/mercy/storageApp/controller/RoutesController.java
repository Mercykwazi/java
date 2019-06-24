package com.mercy.storageApp.controller;

import com.mercy.storageApp.querries.Location;
import com.mercy.storageApp.repositary.LocationRepositary;
import com.mercy.storageApp.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class RoutesController {
    @Resource
@RequestMapping("/location")
//    @Autowired
//    private LocationRepositary repository;
//    private LocationService service;
//    @GetMapping("/location")
//    public String findLocation(Model model){
//        System.out.println("this is calledd walked");
//        List location = (List<Location>) service.findAll();
//        model.addAttribute("cities", location);
//        System.out.println("what is cities"+ location);
//
//        return "Location found";
//    }
//    @PostMapping ("/location")
//
//    public void submit(@RequestBody Location location) {
//        int locationId=location.getId();
//        String firstAddress=location.getAddress1();
//        String secondAddress=location.getAddress2();
//        String  country=location.getCountry();
//        int businessId=location.getBusinessId();
//        System.out.println("wat is in "+ businessId);
//
//  }




}


