package com.example.student.model.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "DEPARTMENTS")
public class Department implements Serializable {
    private @Id
    int id;
    private String deptName;
    private String buildingName;
    private Float budget;

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
    @Column(name = "DEPT_NAME", nullable = true, length = 25)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "BUILDING_NAME", nullable = true, length = 25)
    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    @Basic
    @Column(name = "BUDGET", nullable = true, length = 25)
    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    //CREATE A CLASS CONSTRUCTOR FOR DEPENDENCY INJECTION
    public Department(int id, String deptName, String buildingName, float budget) {
        this.id = id;
        this.deptName = deptName;
        this.buildingName = buildingName;
        this.budget = budget;
    }

    public Department() {
    }
}
