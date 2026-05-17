package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "student_table_mapping")
public class Student {
     
	@Id
	@Column(name ="student id")
	private Integer sId;
	
	@Column(name ="student name")
	private String sName;
	
	@Column(name ="student address")
	private String sAddress;
	
}