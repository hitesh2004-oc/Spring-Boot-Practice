package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.College;

public interface CollegeRepository 
        extends JpaRepository<College, Integer> {

}