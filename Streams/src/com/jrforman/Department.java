package com.jrforman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jason on 9/20/2016.
 */
public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name){
        this.name = name;
        employees = new ArrayList<>();

    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}
