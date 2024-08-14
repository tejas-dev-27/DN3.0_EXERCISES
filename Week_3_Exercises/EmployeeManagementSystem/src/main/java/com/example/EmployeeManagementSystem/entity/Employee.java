package com.example.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@NamedQueries({
        @NamedQuery(name = "Employee.findByDepartmentId",
                query = "SELECT e FROM Employee e WHERE e.department.id = :departmentId"),
        @NamedQuery(name = "Employee.findAllWithSalaryAbove",
                query = "SELECT e FROM Employee e WHERE e.salary > :salary")
})
@Table(name = "employees")
@DynamicUpdate
public class Employee extends Auditable<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use auto-incrementing Long ID
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    private double salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
