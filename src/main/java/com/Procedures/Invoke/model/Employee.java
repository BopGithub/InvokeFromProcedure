package com.Procedures.Invoke.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="employees")
@NamedStoredProcedureQueries(
        @NamedStoredProcedureQuery(name="GET_ALL_EMPLOYEES", procedureName= "GET_ALL_EMPLOYEES", resultClasses = Employee.class,
                parameters = {@StoredProcedureParameter(mode = ParameterMode.REF_CURSOR, type = void.class)}))

@Data
public class Employee {

    @Id
    @Column(name="EMPLOYEE_ID")
    private long employeeId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="ADDRESS")
    private String address;
}
