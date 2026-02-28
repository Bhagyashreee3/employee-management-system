package com.example.ems.repository;

public interface EmployeeRepository {
    // Define methods for CRUD operations
    Employee save(Employee employee);
    Employee findById(Long id);
    List<Employee> findAll();
    void deleteById(Long id);
}