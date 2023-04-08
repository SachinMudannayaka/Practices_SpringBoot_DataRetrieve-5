package com.retrievedata.demo.Service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retrievedata.demo.Dto.DTO;
import com.retrievedata.demo.Entity.user;
import com.retrievedata.demo.Repo.Repo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class userService {
    @Autowired
    private Repo repo;
@Autowired
private ModelMapper modelMapper;

    public DTO postUser(DTO Dto){
        repo.save(modelMapper.map(Dto,user.class));
        return Dto;
    }

    public List<DTO>getAllUser(){
      List<user>userList=repo.findAll();
      return modelMapper.map(userList,new TypeToken<List<DTO>>(){}.getType());
    }
}
