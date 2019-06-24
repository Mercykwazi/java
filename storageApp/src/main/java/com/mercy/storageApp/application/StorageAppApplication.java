package com.mercy.storageApp.application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorageAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorageAppApplication.class, args);
        System.out.println("this really reached here or is called or something");
	}

}
