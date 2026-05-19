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
@Table(name = "product_tab")
public class Product {

    @Id
    @Column(name = "pid")
    private Integer prodId;

    @Column(name = "pcode")
    private String prodCode;

    @OneToMany
    @JoinColumn(name = "pid_fk")
    private List<Model> mods;
}