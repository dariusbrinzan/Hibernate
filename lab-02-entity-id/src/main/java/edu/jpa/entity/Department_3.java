package edu.jpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Department_3")
@IdClass(DepartmentKey.class)
public class Department_3 {
    @Id
    @Column(name = "company_name")
    private String companyName;

    @Id
    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "description")
    private String description;

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
