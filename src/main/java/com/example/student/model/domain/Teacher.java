package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "TEACHERS")
public class Teacher implements Serializable {
    private @Id
    int id;
    private String firstName;
    private String surName;
    private int contact;

    private Section section;
    private Instructor instructor;

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
    @Column(name = "CONTACT", nullable = true, length = 25)
    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    //create mapping for Teacher and Section
    @ManyToOne()
    @JoinColumn(name = "SECTION_ID", referencedColumnName = "ID")
    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    //create mapping for Teacher and Instructor
    @ManyToOne()
    @JoinColumn(name = "INSTRUCTOR_ID", referencedColumnName = "ID")
    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    //create a class constructor for dependency injection
    public Teacher(int id, String firstName, String surName, int contact, Section section, Instructor instructor) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.contact = contact;
        this.section = section;
        this.instructor = instructor;
    }

    //create an empty constructor
    public Teacher() {
    }
}
