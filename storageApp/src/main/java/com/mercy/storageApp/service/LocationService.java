package com.mercy.storageApp.service;

import com.mercy.storageApp.querries.Location;

import java.util.List;

public interface LocationService {
    List<Location> findAll();
    void insertLocation(Location loc);
   // void updateEmployee(Location loc);
  // void executeUpdateEmployee(Location loc);
   // public void deleteEmployee(Location loc);
}
