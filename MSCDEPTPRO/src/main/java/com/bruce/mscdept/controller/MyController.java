package com.bruce.mscdept.controller;

import com.bruce.mscdept.Entity.Employee;
import com.bruce.mscdept.Entity.Student;
import com.bruce.mscdept.Repository.EmployeeRepository;
import com.bruce.mscdept.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class MyController {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @RequestMapping("/m")
    public String welcomeMsg(@RequestParam String name, Model model){
        model.addAttribute("name",name);
        return "welcome";
    }
    @RequestMapping("/register")
    public String home(){
        return "register";
    }
    @RequestMapping("/update")
    public String update(){
        Student student=new Student("18pcs08","mani","cs","18/04/1997");
        studentRepository.save(student);
        Student student1=new Student("18pcs05","kathir","cs","01/02/1998");
        studentRepository.save(student1);
        return "update";
    }
    @RequestMapping("/homepage")
    public String homepage(){
        return "homepage";
    }
    @RequestMapping("/emp")
    public String emp(){
        Employee employee=new Employee("mani","Periyar EVR College");
        employeeRepository.save(employee);
        return "emp";
    }
    @RequestMapping("/display")
    public String dispaly(Model model){
        List<Employee> list=employeeRepository.findAll();
        model.addAttribute("nameList",list);
        return "display";
    }


    @GetMapping(path = "/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok().body("Hello, Maheshwari");
    }
}
