package com.Procedures.Invoke.RepositoryImp;

import com.Procedures.Invoke.model.Employee;
import com.Procedures.Invoke.repository.EmployeeRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

    @Autowired
    private EntityManager em;

    public EmployeeRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Employee> getALLEmployeesFromStoredProcedures() {

        StoredProcedureQuery storedProcedureQuery = this.em.createNamedStoredProcedureQuery("GET_ALL_EMPLOYEES");

        List<Employee> employees = storedProcedureQuery.getResultList();

        return employees;
    }

}
