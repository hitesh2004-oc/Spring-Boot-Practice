package com.app.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usertable")
public class User {

    @Id
    @Column(name = "uid")
    private Integer userId;

    @Column(name = "uname")
    private String userName;

    @Column(name = "uemail")
    private String userEmail;

    @OneToMany
    @JoinColumn(name = "user_fk")
    private List<Order> orders;
}