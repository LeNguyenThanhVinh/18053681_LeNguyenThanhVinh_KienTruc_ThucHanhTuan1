package com.example.lenguyenthanhvinhthuchanhtuan1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lenguyenthanhvinhthuchanhtuan1.entity.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    @Query("from Employee")
    List<Employee> selectEmployeeJPQL();
}
