package com.Procedures.Invoke.controller;

import com.Procedures.Invoke.model.Employee;
import com.Procedures.Invoke.repository.EmployeeRepository;
import com.Procedures.Invoke.repository.EmployeeRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    public EmployeeRepository employeeRepository;

    @GetMapping("/users")
    public List<Employee> getAllEmployees(){

        return employeeRepository.getALLEmployeesFromStoredProcedures();

    }

}
