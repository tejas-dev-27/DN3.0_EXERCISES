package com.example.EmployeeManagementSystem.dto;

public class EmployeeDepartmentDTO {

    private final String name;
    private final String departmentName;

    public EmployeeDepartmentDTO(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
