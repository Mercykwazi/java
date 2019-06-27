package com.mercy.storageApp.controller;

import com.mercy.storageApp.querries.Location;
import com.mercy.storageApp.querries.User;
import com.mercy.storageApp.service.LocationService;
import com.mercy.storageApp.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RoutesController {

    private static final String jwtTokenCookieName = "JWT-TOKEN";
    private static final String signingKey = "signingKey";
    private static final Map<String, String> credentials = new HashMap<>();
    public RoutesController() {
        credentials.put("hellokoding", "hellokoding");
        credentials.put("hellosso", "hellosso");
    }


//@PostMapping("login")
@RequestMapping("/api/private")
@GetMapping
public String getMessage() {
    return "Hello from private API controller";
}






   // @RequestMapping(value = "login", method = RequestMethod.POST)
//    public String login(HttpServletResponse httpServletResponse, String username, String password, String redirect, Model model){
//        if (username == null || !credentials.containsKey(username) || !credentials.get(username).equals(password)){
//            model.addAttribute("error", "Invalid username or password!");
//            System.out.println("what is this oor"+ model.addAttribute("error", "Invalid username or password!"));
//            return "login there is an err";
//        }
//        String token = LogIn.generateToken(signingKey, username);
//        CookieUtil.create(httpServletResponse, jwtTokenCookieName, token, false, -1, "localhost");
//
//        return "redirect:" + redirect;
//    }



    @Resource
    LocationService locationSev;

    @GetMapping("/location")
    public List<Location> getLocations() {
        System.out.println("when this is called I will be happy");
        return locationSev.findAll();
    }

    @PostMapping(value = "/location")
    public void postLocation(@RequestBody Location loc) {
        System.out.println("what is location loc" + loc);
        locationSev.insertLocation(loc);
    }

    @Resource
    UserService userService;
    @RequestMapping ("/login")
    @GetMapping
    public String logIn(){
        return "you have logged in";
    }
@PostMapping(value="/login")
    public void postLogIn(@RequestBody User user){
   userService.insertOwnerDetails(user);
}
}


