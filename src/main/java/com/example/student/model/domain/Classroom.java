package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@Table(name = "CLASSROOMS")
public class Classroom implements Serializable {

    private @Id
    int id;
    private String roomNumber;
    private int capacity;
    private String location;

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
    @Column(name = "ROOM_NUMBER", nullable = true, length = 15)
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Basic
    @Column(name = "CAPACITY", nullable = true, length = 15)
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Basic
    @Column(name = "LOCATION", nullable = true, length = 15)
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //create a class dependency injection
    public Classroom(int id, String roomNumber, int capacity, String location) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.location = location;
    }

    //create an empty dependency
    public Classroom() {
    }
}
