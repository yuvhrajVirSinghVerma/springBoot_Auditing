package com.example.demo.repository;

import com.example.demo.entities.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepo extends JpaRepository<employee, Integer> {
}
