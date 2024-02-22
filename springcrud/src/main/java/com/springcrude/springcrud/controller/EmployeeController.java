package com.springcrude.springcrud.controller;

import com.springcrude.springcrud.entity.Employee;
import com.springcrude.springcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/list-employees")
    public String getEmployees(Model model){
        List<Employee> listOfEmployees = employeeService.findAll();
        model.addAttribute("employees",listOfEmployees);
        return "employees/list-employees";
    }

    @GetMapping("/saveDataForm")
    public String SaveDataForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        model.addAttribute("action", "save");
        return "employees/dataform";
    }

    @PostMapping("save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/employees/list-employees";    // redirect to the employees
    }

    @GetMapping("/updateData")
    public String updateEmployee(@RequestParam("employeeId")int empId, Model model){
        Employee employee = employeeService.findById(empId);
        model.addAttribute("employee",employee);
        model.addAttribute("action", "Update ");
        return "employees/dataform";
    }

    @GetMapping("/deleteData")
    public String deleteEmployee(@RequestParam("employeeId") int empId){
        employeeService.deleteById(empId);
        return "redirect:/employees/list-employees";
    }



}
