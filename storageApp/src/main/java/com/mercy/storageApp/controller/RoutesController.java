package com.mercy.storageApp.controller;

import com.mercy.storageApp.querries.Location;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoutesController {

    private Location location;
    @PostMapping ("/location")
    public void submit(@RequestBody Location location) {
        int locationId=location.getId();
        String firstAddress=location.getAddress1();
        String secondAddress=location.getAddress2();
        String  country=location.getCountry();
        int businessId=location.getBusinessId();
        System.out.println("wat is in "+ businessId);
      //  location.locationDetails(locationId,firstAddress,secondAddress,country,businessId);
     // service.startProcess(article);
      //  location.locationDetails(location);
        //location.locationDetails(location);
  }




}


