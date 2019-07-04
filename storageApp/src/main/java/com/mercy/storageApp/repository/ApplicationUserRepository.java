package com.mercy.storageApp.repository;

import com.mercy.storageApp.queries.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
