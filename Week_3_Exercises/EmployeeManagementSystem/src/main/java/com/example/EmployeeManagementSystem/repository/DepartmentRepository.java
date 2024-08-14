package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT d FROM Department d WHERE d.name = ?1")
    Department findByName(String name);

    @Query("SELECT d FROM Department d WHERE SIZE(d.employees) > ?1")
    List<Department> findDepartmentsWithMoreThanXEmployees(int numberOfEmployees);

    Department findDepartmentByName(String name);


}
