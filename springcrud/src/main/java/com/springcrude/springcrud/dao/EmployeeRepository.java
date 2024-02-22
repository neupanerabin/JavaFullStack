package com.springcrude.springcrud.dao;

import com.springcrude.springcrud.entity.Employee;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    @Query(value="Select e from Employee e")
    List<Employee> getResultOrderByFristName(SpringDataWebProperties.Sort sort);

    List<Employee> findAllByOrderByEmailDesc();
}
