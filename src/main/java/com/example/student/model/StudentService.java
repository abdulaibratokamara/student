package com.example.student.model;

import com.example.student.model.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudent();
    Student findAllStudentById(int id);
    void deleteStudentById(int id);
    Student saveStudent (Student newStudent);
}
