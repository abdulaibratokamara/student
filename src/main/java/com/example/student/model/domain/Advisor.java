package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "ADVISORS")
public class Advisor implements Serializable {
    private @Id
    int id;
    private String firstName;
    private String surname;
    private String email;
    private int contact;
    private Instructor instructor;
    private Student student;

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
    @Column(name = "FIRST_NAME", nullable = true, length = 15)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "SURNAME", nullable = true, length = 15)
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 15)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "CONTACT", nullable = true, length = 15)
    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    //create a mapping relation for Advisor and Instructor
    @OneToMany()
    @JoinColumn(name = "INSTRUCTOR_ID", referencedColumnName = "ID")
    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    //create a mapping between Advisor and Student
    @OneToMany()
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //create a class constructor for dependency injection
    public Advisor(int id, String firstName, String surname, String email, int contact, Instructor instructor, Student student) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.contact = contact;
        this.instructor = instructor;
        this.student = student;
    }

    //create an empty construct
    public Advisor() {
    }
}
