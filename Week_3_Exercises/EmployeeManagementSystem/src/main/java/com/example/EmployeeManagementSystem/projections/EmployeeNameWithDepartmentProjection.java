package com.example.EmployeeManagementSystem.projections;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeNameWithDepartmentProjection {

    String getName();

    @Value("#{target.name + ' (' + target.department.name + ')'}")
    String getNameWithDepartment();
}
