package com.example.student.model;

import com.example.student.model.data.StudentRepository;
import com.example.student.model.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudent() {
        return this.studentRepository.findAll() ;
    }

    @Override
    public Student findAllStudentById(int id) {
        return this.studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(int id) {
        this.studentRepository.deleteById(id);
    }

    @Override
    public Student saveStudent(Student newStudent) {
        return this.studentRepository.save(newStudent);
    }

}
