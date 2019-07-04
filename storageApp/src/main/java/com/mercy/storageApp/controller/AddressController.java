package com.mercy.storageApp.controller;

import com.mercy.storageApp.queries.Address;
//import com.mercy.storageApp.repository.AddressRepository;
//import com.mercy.storageApp.repository.AddressessRepository;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class AddressController {
   // @Resource
   // AddressRepository address;
   // AddressessRepository newAddress;

    @GetMapping("/location")
   // public List<Address> getLocations() {
            public void getLocations(){
        System.out.println("when this is called I will be happy");

    }

    @PostMapping(value = "/location")
    public void postLocation(@RequestBody Address loc) {
        //System.out.println("what is location loc" + Address);
     //  newAddress.save(loc);
    }



}


