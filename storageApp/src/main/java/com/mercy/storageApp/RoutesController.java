package com.mercy.storageApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoutesController {

    private Location location;
    @PostMapping ("/location")
    public void submit(@RequestBody Location location) {
        System.out.println("what is location"+location.getAddress1());
     // service.startProcess(article);
      //  location.locationDetails(location);
        //location.locationDetails(location);
  }




}


