package com.mercy.storageApp.repositary;
import com.mercy.storageApp.querries.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepositary extends CrudRepository<Location, Long> {

}