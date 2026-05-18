package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "ordertable")
public class Order {

    @Id
    @Column(name = "oid")
    private Integer orderId;

    @Column(name = "ocode")
    private String orderCode;

    @Column(name = "oamount")
    private Double orderAmount;
}