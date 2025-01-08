package edu.jpa.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Company {
    @Id
    private int id;
    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Department> departments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
