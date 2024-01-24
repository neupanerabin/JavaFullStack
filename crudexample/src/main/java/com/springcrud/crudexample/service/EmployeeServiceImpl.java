package com.springcrud.crudexample.service;

import com.springcrud.crudexample.dao.EmployeeDAO;
import com.springcrud.crudexample.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
        EmployeeDAO employeeDao;
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        Employee saveEmployee = employeeDao.save(employee);
        return saveEmployee;
    }

    @Override
    public void delete(int id) {

    }
}
