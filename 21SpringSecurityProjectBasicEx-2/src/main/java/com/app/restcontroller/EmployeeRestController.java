package com.app.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class EmployeeRestController {

    List<Employee> list = new ArrayList<>(
            List.of(
                    new Employee(1, "A", "Jaipur"),
                    new Employee(2, "B", "Udaipur"),
                    new Employee(3, "C", "Indore")
            )
    );

    @GetMapping("/show-employee")
    public List<Employee> showEmployee() {
        return list;
    }

    @PostMapping("/add-Employee")
    public void addEmployee(@RequestBody Employee employee) {
        list.add(employee);
    }

    @GetMapping("/get-info")
    public String getCourseInfo(HttpServletRequest request) {

        return "CodeXPrasoon Launched MERN Stack Course Free On Youtube From Scratch "
                + request.getSession().getId();
    }

    @GetMapping("/get-moreinfo")
    public String getCourseMoreInfo(HttpServletRequest request) {

        return "Its 4 month Weekend Course "
                + request.getSession().getId();
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrfToken(HttpServletRequest request) {

        return (CsrfToken) request.getAttribute("_csrf");
    }
}