package com.saimanoj.studentspringbootapplication.example.controller;

import com.saimanoj.studentspringbootapplication.example.entity.Student;
import com.saimanoj.studentspringbootapplication.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }
    @GetMapping("/students")
    public List<Student> findAllStudents(){
        return service.getStudents();
    }
    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }
    @GetMapping("/studentByName/{name}")
    public Student findStudentByName(@PathVariable String name){
        return service.getStudentByName(name);
    }

    @GetMapping("/studentByMajor/{major}")
    public Student findStudentByMajor(@PathVariable String major){
        return service.getStudentByMajor(major);
    }

    @GetMapping("/studentByCgpa/{cgpa}")
    public Student findStudentByCgpa(@PathVariable double cgpa){
        return service.getStudentsByCgpa(cgpa);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStudent(student);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteStudent(id);
    }
}
