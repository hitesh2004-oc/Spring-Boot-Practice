package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="product_table")
public class Product {
      
	@Id
	@Column(name ="pid")
	private Integer pid;
     
	@Column
	private String pname;
	
	@Column
	private Double pcost;
}