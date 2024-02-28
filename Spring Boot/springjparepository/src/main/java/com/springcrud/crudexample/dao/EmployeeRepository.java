package com.springcrud.crudexample.dao;

import com.springcrud.crudexample.entity.Employee;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value="Select e From Employee e")
    List<Employee> getResultOrderByFirstName(Sort firstName);
    List<Employee> findAllByOrderByEmailDesc();


}
