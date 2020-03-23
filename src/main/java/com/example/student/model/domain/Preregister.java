package com.example.student.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "PREREGISTERS")
public class Preregister implements Serializable {
    private @Id
    int id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date registerDate;

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
    @Column(name = "REGISTER_DATE", nullable = true, length = 25)
    @Temporal(TemporalType.DATE)
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    //create a mapping relation for Preregister and Course
    @ManyToOne
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    //create a class constructor for dependency injection
    public Preregister(int id, Date registerDate, Course course) {
        this.id = id;
        this.registerDate = registerDate;
        this.course = course;
    }

    //create an empty constructor
    public Preregister() {
    }
}
