package com.springcrud.crudexample.controller;

import com.springcrud.crudexample.entity.Employee;
import com.springcrud.crudexample.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
        private EmployeeService employeeService;
        public EmployeeController(EmployeeService employeeService){
            this.employeeService=employeeService;
        }

   @GetMapping("/employees")
   public List<Employee> findAll(){
       List<Employee> allEmployee = employeeService.findAll();
       return allEmployee;
   }
    @GetMapping("employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);
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
            employeeService.delete(employeeId);
            return "Employee deleted for id : "+ employeeId;
    }

}
