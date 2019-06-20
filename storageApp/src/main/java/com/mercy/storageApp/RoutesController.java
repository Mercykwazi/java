package com.mercy.storageApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutesController {
    @Autowired
    private Location location;
    @GetMapping("/location")
    public void submit(@RequestBody Location location) {
        System.out.println("what is location"+location);
     // service.startProcess(article);
        //location.locationDetails(location);
  }


}
