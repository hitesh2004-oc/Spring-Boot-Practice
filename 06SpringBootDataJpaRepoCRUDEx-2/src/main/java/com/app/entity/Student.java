package com.app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Table(name ="student_tab")
@Entity
public class Student {
	
	@Id
	@Column(name = "sid")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer stdId;
	
     
	@Column(name = "sname")
	private String stdName ;
	
	@Column(name ="sfee")
	private Double stdFee;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sdoj")
	private Date stdDoj;
}