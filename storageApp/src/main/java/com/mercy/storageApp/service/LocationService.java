package com.mercy.storageApp.service;

import com.mercy.storageApp.querries.Address;

import java.util.List;

public interface LocationService {
    List<Address> findAll();
    void insertLocation(Address loc);
   // void updateLocation(Location loc);

}
