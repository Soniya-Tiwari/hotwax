package com.Assignment.app.rest.Controller;
import com.Assignment.app.rest.Repo.UserRepo;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ApiControllers {

            private UserRepo userRepo;
            @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/users")
            public List<User> getUsers(){
                return userRepo.findAll();
    }
    @GetMapping (value = "/save ")
    public String saveUser(User user){
                userRepo.save(user);
                return "saved....";
    }
}
