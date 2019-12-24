package com.Procedures.Invoke.repository;

import com.Procedures.Invoke.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepositoryCustom {

    List<Employee> getALLEmployeesFromStoredProcedures();
}
