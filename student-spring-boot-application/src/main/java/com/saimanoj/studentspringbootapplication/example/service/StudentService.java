package com.saimanoj.studentspringbootapplication.example.service;

import com.saimanoj.studentspringbootapplication.example.entity.Student;
import com.saimanoj.studentspringbootapplication.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public Student saveStudent(Student student){
        return repo.save(student);
    }
    public List<Student> saveStudents(List<Student> students){
        return repo.saveAll(students);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }

    public Student getStudentById(int id){
        return repo.findById(id).orElse(null);
    }

    public Student getStudentByName(String name){
        return repo.findByName(name);
    }
    public Student getStudentByMajor(String major){
        return repo.findByMajor(major);
    }
    public Student getStudentsByCgpa(double cgpa){
        return repo.findByCgpa(cgpa);
    }

    public String deleteStudent(int id){
        repo.deleteById(id);
        return "Student Removed from the repo with Id : "+ id;
    }

    public Student updateStudent(Student student){
        Student existingStudent = repo.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setMajor(student.getMajor());
        existingStudent.setCgpa(student.getCgpa());
        return repo.save(existingStudent);
    }

}
