package com.saimanoj.studentspringbootapplication.example.repository;

import com.saimanoj.studentspringbootapplication.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByName(String name);

    Student findByCgpa(double cgpa);

    Student findByMajor(String major);
}
