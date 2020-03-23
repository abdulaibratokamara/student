package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "STUDENTS")
public class Student implements Serializable {
    private @Id
    int id;
    private String firstName;
    private String surname;
    private int contact;
    private String gender;
    private int totalCredit;
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
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "CONTACT", nullable = true, length = 25)
    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Basic
    @Column(name = "GENDER", nullable = true, length = 25)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "TOTAL_CREDIT", nullable = true, length = 25)
    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    //create a mapping for Student and Department
    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "ID")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    //create a class constructor for dependency injection
    public Student(int id, String firstName, String surname, int contact, String gender, int totalCredit, Department department) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.contact = contact;
        this.gender = gender;
        this.totalCredit = totalCredit;
        this.department = department;
    }

    public Student() {
    }
}
