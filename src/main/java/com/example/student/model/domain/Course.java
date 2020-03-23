package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "COURSES")
public class Course implements Serializable {
    private @Id
    int id;
    private String courseName;
    private int credit;

    private Department department;

    //create getters and setters
    @Column(name = "ID", nullable = false, precision = 0)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "COURSE_NAME", nullable = true, length = 25)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "CREDIT", nullable = true, length = 25)
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    //create a mapping relation for Course and Department
    @ManyToOne()
    @JoinColumn(name = "DEPARTMENT_ID", columnDefinition = "ID")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //create a class constructor dependency injection
    public Course(int id, String courseName, int credit, Department department) {
        this.id = id;
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
    }

    //create an empty constructor
    public Course() {
    }


}
