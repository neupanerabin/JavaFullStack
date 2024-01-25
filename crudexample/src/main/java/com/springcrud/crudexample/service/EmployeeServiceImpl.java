package com.springcrud.crudexample.service;

import com.springcrud.crudexample.dao.EmployeeDAO;
import com.springcrud.crudexample.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDAO employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }
    @Override
    public List<Employee> findAll() {
        List<Employee> allEmployees = employeeDao.findAll();
        return allEmployees;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = employeeDao.findById(id);
        if(employee == null){
            throw new RuntimeException("Employee not found for id: "+ id);
        }
        return employee;
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        Employee saveEmployee = employeeDao.save(employee);
        return saveEmployee;
    }
    @Transactional
    @Override
    public void delete(int id) {
        employeeDao.delete(id);
    }
}
