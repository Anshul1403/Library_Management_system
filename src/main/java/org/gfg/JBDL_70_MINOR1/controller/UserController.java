package org.gfg.JBDL_70_MINOR1.controller;

import org.gfg.JBDL_70_MINOR1.dto.UserRequest;
import org.gfg.JBDL_70_MINOR1.model.User;
import org.gfg.JBDL_70_MINOR1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addStudent")
    public User addStudent(@RequestBody UserRequest userRequest){
       return userService.addStudent(userRequest);

    }

    @PostMapping("/addAdmin")
    public User addAdmin(@RequestBody UserRequest userRequest ){
        return null;
    }

    @GetMapping("/filter")
    public List<User> filter(@RequestParam("filterBy") String filterBy,
                             @RequestParam("operator") String operator,
                             @RequestParam("values") String values){

        return userService.filter(filterBy, operator, values);

    }


}
