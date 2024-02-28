package com.springcrud.crudexample.dao;

import com.springcrud.crudexample.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    // findAll]
    List<Employee> findAll();

    // findBy ID
    Employee findById(int id);

    // save
    Employee save(Employee employee);

    //delete
    void delete(int id);
}
