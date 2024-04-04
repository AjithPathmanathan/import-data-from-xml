package com.example.firstproject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface employeerepository extends JpaRepository<employee,Integer> {
}
