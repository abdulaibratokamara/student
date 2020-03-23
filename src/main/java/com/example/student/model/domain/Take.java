package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "TAKES")
public class Take implements Serializable {
    private @Id
    int id;
    private String level;

    private Student student;
    private Section section;

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
    @Column(name = "LEVEL", nullable = true, length = 25)
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    //create a mapping for Take and Students
    @ManyToOne
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //create a relation for Take and Section
    @ManyToOne
    @JoinColumn(name = "SECTION_ID", referencedColumnName = "ID")
    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    //create a class constructor for dependency injection
    public Take(int id, String level, Student student, Section section) {
        this.id = id;
        this.level = level;
        this.student = student;
        this.section = section;
    }

    public Take() {
    }
}
