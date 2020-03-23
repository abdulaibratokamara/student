package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "SECTIONS")
public class Section implements Serializable {
    private @Id
    int id;
    private String semester;
    private String year;

    private Classroom classroom;
    private Course course;

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
    @Column(name = "SEMESTER", nullable = true, length = 25)
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic
    @Column(name = "YEAR", nullable = true, length = 25)
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    //create a mapping relation for Section and Classroom
    @ManyToOne()
    @JoinColumn(name = "CLASSROOM_ID", referencedColumnName = "ID")
    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    //create a mapping relation for Section and Course
    @ManyToOne()
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    //create a class constructor for dependency injection
    public Section(int id, String semester, String year, Classroom classroom, Course course) {
        this.id = id;
        this.semester = semester;
        this.year = year;
        this.classroom = classroom;
        this.course = course;
    }

    public Section() {
    }
}
