package com.Procedures.Invoke.repository;

import com.Procedures.Invoke.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> ,EmployeeRepositoryCustom  {

}
