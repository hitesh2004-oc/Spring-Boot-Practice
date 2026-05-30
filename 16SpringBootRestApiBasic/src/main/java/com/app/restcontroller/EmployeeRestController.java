package com.app.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

@RestController
public class EmployeeRestController {
	List<Employee> listofEmployee = new ArrayList<>(
			List.of( new Employee(1,"A","Jaipur"),
					new Employee(2, "B","Udaipur"),
					new Employee(3,"C", "Indore")
		     	)
			);
	@GetMapping("/show-employee")
	public List<Employee> showEmployee(){
		return listofEmployee;
		
	}
	@PostMapping("/add-Employee")
			public void addEmployee(@RequestBody Employee employee) {
			listofEmployee.add(employee);
         }

}
