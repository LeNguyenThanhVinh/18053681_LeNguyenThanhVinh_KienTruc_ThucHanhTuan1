package com.example.lenguyenthanhvinhthuchanhtuan1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lenguyenthanhvinhthuchanhtuan1.entity.Employee;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
    @Query(
            value = "select * from employee",
            nativeQuery = true
    )
    List<Employee> selectAllEmployee();

    @Query(
            value = "delete * from employee",
            nativeQuery = true
    )

    void deleteInNative();
}
