package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.models.UserById;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    @GetMapping("get_User")
    public User getUserByJSON(@RequestBody UserById user){
        return userService.getUser(user.getId());
    }

}
