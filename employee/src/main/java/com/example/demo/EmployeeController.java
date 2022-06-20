package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listEmployee(){
        return "list employee";
    }
}
