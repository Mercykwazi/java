package com.mercy.storageApp.controller;

//import com.mercy.storageApp.queries.Jwt;
// import com.mercy.storageApp.queries.User;
// import org.springframework.web.bind.annotation.*;

// import javax.annotation.Resource;
// import java.util.ArrayList;

// import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

import com.mercy.storageApp.jwt.JwtRequest;
import com.mercy.storageApp.queries.User;
import com.mercy.storageApp.repository.ApplicationUserRepository;
import com.mercy.storageApp.repository.UserRepository;
import com.mercy.storageApp.security.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

//@RestController
public class BusinessController {
//    @Resource
//
//    private ArrayList<User> user= newArrayList();
//    Jwt jwt =new Jwt();
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public ArrayList<User> User() {
//        System.out.println("jws: "+ jwt.getJws());
//      //  System.out.println("userJwt"+jwt.getJws(user));
//        return user;
//    }
//
//    @PostMapping(value="/login")
//    public void postLogIn(@RequestBody User user){
//        System.out.println("this is the user"+user);
//  // userSev.insertOwnerDetails(user);
//}
@Autowired
private UserRepository userRepository;

    @Autowired
    private JwtGenerator jwtGenerator;

    @PostMapping("/registor")
    public Map<String , String> registorUser(@RequestBody User registorDetails) {
        Map<String, String> token = new HashMap<>();
        User user = userRepository.saveUser(registorDetails);
        String generatoredToken = jwtGenerator.generate(registorDetails);
        token.put("token" , generatoredToken);
        return token;
    }


    @RequestMapping("/cars")
    public User getBusiness(@RequestParam String name) {
        User user = userRepository.findUserByUserName(name);
        System.out.println("user " + user);
        return user;
    }


    @PostMapping("/authenticate")
    public Map<String , String> createAuthenticationToken(@RequestBody JwtRequest user) {
        Map<String , String> token = new HashMap<>();
        try {
            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
            User foundUser = userRepository.findUserByUserName(user.getUserName());
            if(foundUser == null){
                throw new UsernameNotFoundException("user not found");
            }
            boolean isAuthorization = bCryptPasswordEncoder.matches(user.getPassword(), foundUser.getPassword());
            if (!isAuthorization) {
                System.out.println("password is incorrect !");
            } else {
                String generatedToken = jwtGenerator.generate(foundUser);
                token.put("token" , generatedToken);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return token;
    }





}



