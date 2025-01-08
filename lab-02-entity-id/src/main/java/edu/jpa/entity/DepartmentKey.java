package edu.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DepartmentKey implements Serializable {
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "department_name")
    private String departmentName;

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

    // hashCode and equals for composite key
    @Override
    public int hashCode() {
        return Objects.hash(companyName, departmentName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        DepartmentKey that = (DepartmentKey) obj;
        return Objects.equals(companyName, that.companyName) &&
                Objects.equals(departmentName, that.departmentName);
    }
}
