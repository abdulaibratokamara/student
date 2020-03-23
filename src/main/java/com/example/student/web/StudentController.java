package com.example.student.web;

import com.example.student.model.StudentService;
import com.example.student.model.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/findAllStudent")
    public List<Student> findAllStudent() {
        return this.studentService.findAllStudent();
    }

   @GetMapping("/findAllStudentById/{id}")
    public Student findAllStudentById(@PathVariable int id) {
        return this.studentService.findAllStudentById(id);
    }

   @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable int id) {
        this.studentService.deleteStudentById(id);
    }

   @PostMapping("/saveStudent")
    public Student save(@RequestBody Student newStudent) {
        return this.studentService.saveStudent(newStudent);
    }

}
