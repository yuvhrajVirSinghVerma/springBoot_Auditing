package com.example.demo.controller;

import com.example.demo.entities.Laptops;
import com.example.demo.entities.department;
import com.example.demo.entities.employee;
import com.example.demo.services.DepartmentService;
import com.example.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empServ;

    @PostMapping(path = "/employee")
    public employee createDept(@RequestBody employee emp){
        return empServ.createEmp(emp);
    }

    @GetMapping(path = "/getEmps")
    public List<employee> getEmps(){
        return empServ.getEmps();
    }

    @PostMapping(path="/createLaptop")
    public Laptops createLaptop(@RequestBody Laptops laptop){
        return empServ.createLaptop(laptop);
    }
    @PostMapping(path="{empId}/addLaptops/{laptopId}")
    public employee addLaptops(@PathVariable int empId, @PathVariable int laptopId){
        return empServ.addLaptops(empId,laptopId);
    }

}
