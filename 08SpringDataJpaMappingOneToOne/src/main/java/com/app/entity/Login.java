package com.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Login_Table")
public class Login {
      
	@Id
	@Column(name ="login id")
	private Integer loginId;
	
	@Column(name ="username")
	private String userName;
	
	@Column(name ="password")
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_id_fk")
	private Student student;
}