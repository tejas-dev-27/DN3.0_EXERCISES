package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.projections.EmployeeNameEmailProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.EmployeeManagementSystem.dto.EmployeeDepartmentDTO;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    List<EmployeeNameEmailProjection> findAllByDepartmentName(String departmentName);

    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeDepartmentDTO(e.name, d.name) " +
            "FROM Employee e JOIN e.department d WHERE d.name = :departmentName")
    List<EmployeeDepartmentDTO> findEmployeesByDepartmentName(@Param("departmentName") String departmentName);

    Employee findByEmail(String email);

    List<Employee> findByDepartmentName(String departmentName);
}
