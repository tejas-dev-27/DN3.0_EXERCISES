package com.example.EmployeeManagementSystem;
import com.example.EmployeeManagementSystem.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> findEmployeesByDepartmentId(Long departmentId) {
        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByDepartmentId", Employee.class);
        query.setParameter("departmentId", departmentId);
        return query.getResultList();
    }

    public List<Employee> findAllWithSalaryAbove(double salary) {
        TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findAllWithSalaryAbove", Employee.class);
        query.setParameter("salary", salary);
        return query.getResultList();
    }
}
