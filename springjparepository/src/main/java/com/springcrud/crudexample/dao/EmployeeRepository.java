package com.springcrud.crudexample.dao;

import com.springcrud.crudexample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository {

    // findAll]
    List<Employee> findAll();

    // findBy ID
    Employee findById(int id);

    // save
    Employee save(Employee employee);

    //delete
    void delete(int id);
}
