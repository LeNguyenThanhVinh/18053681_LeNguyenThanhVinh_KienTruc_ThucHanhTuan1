package com.example.lenguyenthanhvinhthuchanhtuan1;

import com.example.lenguyenthanhvinhthuchanhtuan1.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeNguyenThanhVinhThucHanhTuan1ApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Test native branch

    @Test
    void testSelect() {
        System.out.println(employeeRepository.selectAllEmployee());
    }

}
