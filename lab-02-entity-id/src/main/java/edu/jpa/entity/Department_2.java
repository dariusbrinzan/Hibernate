package edu.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Department_2")
public class Department_2 {
    @EmbeddedId
    private DepartmentKey id;

    @Column(name = "description")
    private String description;

    // Getters and Setters
    public DepartmentKey getId() {
        return id;
    }

    public void setId(DepartmentKey id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
