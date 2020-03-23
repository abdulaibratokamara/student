package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "TIMESLOTS")
public class Timeslot implements Serializable {
    private @Id
    int id;
    private String day;
    private String timeSlot;
    private String startHr;
    private String startMin;
    private String endHr;
    private String endMin;

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
    @Column(name = "DAY", nullable = true, length = 25)
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Basic
    @Column(name = "TIMESLOT", nullable = true, length = 25)
    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Basic
    @Column(name = "STARTHR", nullable = true, length = 25)
    public String getStartHr() {
        return startHr;
    }

    public void setStartHr(String startHr) {
        this.startHr = startHr;
    }

    @Basic
    @Column(name = "STARTMIN", nullable = true, length = 25)
    public String getStartMin() {
        return startMin;
    }

    public void setStartMin(String startMin) {
        this.startMin = startMin;
    }

    @Basic
    @Column(name = "ENDHR", nullable = true, length = 25)
    public String getEndHr() {
        return endHr;
    }

    public void setEndHr(String endHr) {
        this.endHr = endHr;
    }

    @Basic
    @Column(name = "ENDMIN", nullable = true, length = 25)
    public String getEndMin() {
        return endMin;
    }

    public void setEndMin(String endMin) {
        this.endMin = endMin;
    }

    //create a class constructor for dependency injection
    public Timeslot(int id, String day, String timeSlot, String startHr, String startMin, String endHr, String endMin) {
        this.id = id;
        this.day = day;
        this.timeSlot = timeSlot;
        this.startHr = startHr;
        this.startMin = startMin;
        this.endHr = endHr;
        this.endMin = endMin;
    }

    public Timeslot() {
    }
}
