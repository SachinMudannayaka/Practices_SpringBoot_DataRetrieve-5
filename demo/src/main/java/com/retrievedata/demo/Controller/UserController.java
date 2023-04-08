package com.retrievedata.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retrievedata.demo.Dto.DTO;
import com.retrievedata.demo.Service.userService;

@RequestMapping(value="api/v/user")
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private userService userservice;

    @PostMapping("/postUser")
    public DTO postUser(@RequestBody DTO Dto){
       return userservice.postUser(Dto);

    }

    @GetMapping("/getUser")
    public List<DTO> getAllUser(){
       return userservice.getAllUser() ;
       }


}
