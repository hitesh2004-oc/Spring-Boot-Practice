package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Branch;

public interface BranchRepository 
        extends JpaRepository<Branch, Integer> {

}