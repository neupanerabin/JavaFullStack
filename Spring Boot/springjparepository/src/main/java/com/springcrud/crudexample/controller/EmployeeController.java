package com.springcrud.crudexample.controller;

import com.springcrud.crudexample.dao.EmployeeRepository;
import com.springcrud.crudexample.entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
        private EmployeeRepository employeeService;
        public EmployeeController(EmployeeRepository employeeService){
            this.employeeService=employeeService;
        }

   @GetMapping("/employees")
   public List<Employee> findAll(){
       List<Employee> allEmployee = employeeService.findAll();
       return allEmployee;
   }
    @GetMapping("/employees/orderByEmail")
    public List<Employee> findByOrderEmail() {
        List<Employee> allEmployee= employeeService.findAllByOrderByEmailDesc();
        return allEmployee;
    }

    @GetMapping("/employees/orderByFirstName")
    public List<Employee> findByOrderFirst() {
        List<Employee> allEmployee= employeeService.getResultOrderByFirstName(Sort.by("firstName"));
        return allEmployee;
    }
    @GetMapping("employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId){
        Optional<Employee> optionalEmployee = employeeService.findById(employeeId);
        Employee employee = optionalEmployee.orElse(new Employee());
        return employee;
    }

    @PostMapping("/employees")
    public Employee insertEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee insertEmployee = employeeService.save(employee);
        return insertEmployee;
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee=employeeService.save(employee);
        return updatedEmployee;
    }


    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
            employeeService.deleteById(employeeId);
            return "Employee deleted for id : "+ employeeId;
    }

}
