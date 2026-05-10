package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "SpringStudent")
public class Student {

    @Id
    @Column(name = "stdId")
    private Integer stdId;

    @Column(name = "stdName")
    private String stdName;

    @Column(name = "stdFee")
    private Double stdFee;
}