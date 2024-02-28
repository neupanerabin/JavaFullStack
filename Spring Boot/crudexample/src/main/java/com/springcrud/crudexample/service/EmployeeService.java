package com.springcrud.crudexample.service;

import com.springcrud.crudexample.entity.Employee;

import java.util.List;

public interface EmployeeService {

    // findAll]
    List<Employee> findAll();

    // findBy ID
    Employee findById(int id);

    // save
    Employee save(Employee employee);
    //delete
    void delete(int id);
}
