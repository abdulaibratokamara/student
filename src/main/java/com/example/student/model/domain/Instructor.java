package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "INSTRUCTORS")
public class Instructor implements Serializable {
    private @Id
    int id;
    private String firstName;
    private String surName;
    private Float salary;

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
    @Column(name = "FIRST_NAME", nullable = true, length = 25)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "SURNAME", nullable = true, length = 25)
    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Basic
    @Column(name = "SALARY", nullable = true, length = 25)
    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    //create a mapping relation for Instructor and Department
    @ManyToOne()
    @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "ID")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //create a constructor
    public Instructor(int id, String firstName, String surName, Float salary, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
        this.department = department;
    }

    public Instructor() {
    }
}
