package com.example.lenguyenthanhvinhthuchanhtuan1;

import com.example.lenguyenthanhvinhthuchanhtuan1.entity.Employee;
import com.example.lenguyenthanhvinhthuchanhtuan1.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeNguyenThanhVinhThucHanhTuan1ApplicationTests {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void testSaveRepo() {
        Employee employee = new Employee(1,"Vinh");
        employeeRepository.save(employee);
    }

    @Test
    void testReadRepo() {
        System.out.println(employeeRepository.findAll());
    }

    @Test
    void testUpdateRepo() {
        Employee employee = employeeRepository.findAll().get(0);
        employee.setName("Thành Vinh");
        employeeRepository.save(employee);
    }

    @Test
    void testDeleteRepo() {
        employeeRepository.deleteAll();
    }
}
