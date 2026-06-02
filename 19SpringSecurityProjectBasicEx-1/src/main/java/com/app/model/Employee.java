package com.app.model;

// Model Class
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Integer empId;
	
	private String empName;
	
	private String empCity;

}
