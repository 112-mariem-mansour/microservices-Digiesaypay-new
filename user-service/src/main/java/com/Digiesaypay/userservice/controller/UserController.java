package com.Digiesaypay.userservice.controller;
import com.Digiesaypay.userservice.dto.UserRequest;
import com.Digiesaypay.userservice.dto.UserResponse;
import com.Digiesaypay.userservice.model.User;

import com.Digiesaypay.userservice.repository.UserRepository;
import com.Digiesaypay.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService ;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UserRequest userRequest) {
        userService.createUser(userRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> getAllUsers(){
       return  userService.getAllUsers();
    }

}
