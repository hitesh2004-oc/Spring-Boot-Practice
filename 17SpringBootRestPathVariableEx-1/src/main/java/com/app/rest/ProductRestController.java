package com.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    // http://localhost:9090/product/dataa?pid=10&pname=Hitesh
    // Using RequestParam
    @GetMapping("/dataa")
    public ResponseEntity<String> showDataA(
            @RequestParam("pid") Integer id,
            @RequestParam("pname") String name
    ) {

        System.out.println("PID :" + id + " PNAME :" + name);

        return new ResponseEntity<>("PID " + id + " PNAME " + name,HttpStatus.OK);
    }

    // http://localhost:9090/product/datab/11/Vinod
    // Using PathVariable
    @GetMapping("/datab/{pid}/{pname}")
    public ResponseEntity<String> showDataB(
            @PathVariable("pid") Integer id,
            @PathVariable("pname") String name
    ) {

        System.out.println("PID :" + id + " PNAME :" + name);

        return new ResponseEntity<>("PID " + id + " PNAME " + name,HttpStatus.OK
        );
    }
}