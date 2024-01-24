package com.springcrud.crudexample.dao;

import com.springcrud.crudexample.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    EntityManager entityManager;

    public  EmployeeDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll(){
        TypedQuery<Employee> selectAllQuery = entityManager.createQuery("From Employee ", Employee.class);
        List<Employee> allEmployee = selectAllQuery.getResultList();
        return  allEmployee;

    }


    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee saveEmployee = entityManager.merge(employee);
        return saveEmployee;
    }

    @Override
    public void delete(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(id);
    }
}
