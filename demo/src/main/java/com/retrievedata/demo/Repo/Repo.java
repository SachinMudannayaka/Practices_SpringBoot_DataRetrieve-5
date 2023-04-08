package com.retrievedata.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retrievedata.demo.Entity.user;

public interface Repo extends JpaRepository< user ,Integer> {
    
}
