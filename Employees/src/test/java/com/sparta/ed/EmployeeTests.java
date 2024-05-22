package com.sparta.ed;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class EmployeeTests {
    private Employee employee;

    @BeforeEach
    public void setUpAll() {
        employee = new Employee(1, "Mr.", "Conner", "A.", "Humphries", "M", "c.humphrey@example.com", LocalDate.of(1990, 1, 1), LocalDate.of(2024, 5, 22), 50000);
    }

    @Test
    @DisplayName("Get First Name")
    public void getFirstName() {
        Assertions.assertEquals("Conner", employee.getFirstName());
    }

    @Test
    @DisplayName("Set First Name")
    public void setFirstName() {
        employee.setFirstName("Jane");
        Assertions.assertEquals("Jane", employee.getFirstName());
    }

    @Test
    @DisplayName("Get Last Name")
    public void getLastName() {
        Assertions.assertEquals("Humphrey", employee.getLastName());
    }

    @Test
    @DisplayName("Set Last Name")
    public void setLastName() {
        employee.setLastName("Smith");
        Assertions.assertEquals("Smith", employee.getLastName());
    }

    @Test
    @DisplayName("Get Gender")
    public void getGender() {
        Assertions.assertEquals("M", employee.getGender());
    }

    @Test
    @DisplayName("Set Gender")
    public void setGender() {
        employee.setGender("F");
        Assertions.assertEquals("F", employee.getGender());
    }

    @Test
    @DisplayName("Get Email")
    public void getEmail() {
        Assertions.assertEquals("c.humphrey@example.com", employee.getEmail());
    }

    @Test
    @DisplayName("Set Email")
    public void setEmail() {
        employee.setEmail("jane.doe@example.com");
        Assertions.assertEquals("jane.doe@example.com", employee.getEmail());
    }

    @Test
    @DisplayName("Get Date of Birth")
    public void getDob() {
        Assertions.assertEquals(LocalDate.of(2000,1,1), employee.getDob());
    }

    @Test
    @DisplayName("Set Date of Birth")
    public void testSetDob() {
        employee.setDob(LocalDate.of(1995,12,25));
        Assertions.assertEquals(LocalDate.of(1995,12,25), employee.getDob());
    }

    @Test
    @DisplayName("Get Date Joined")
    public void getDateJoined() {
        Assertions.assertEquals(LocalDate.of(2024,5,22), employee.getDateJoined());
    }

    @Test
    @DisplayName("Set Date Joined")
    public void setDateJoined() {
        employee.setDateJoined(LocalDate.of(2022,1,1));
        Assertions.assertEquals(LocalDate.of(2022,1,1), employee.getDateJoined());
    }

    @Test
    @DisplayName("Get Salary")
    public void getSalary() {
        Assertions.assertEquals(50000, employee.getSalary());
    }

    @Test
    @DisplayName("Set Salary")
    public void setSalary() {
        employee.setSalary(60000);
        Assertions.assertEquals("60000", employee.getSalary());
    }


    @Test
    @DisplayName("Employee ToString")
    public void testToString() {
        String expected = "Employee{empID=1, title='Mr.', firstName='Conner', middleName='A.', lastName='Humphries', gender='M', email='c.humphrey@example.com', dob=2000-01-01, dateJoined=2024-05-22, salary=50000}";
        Assertions.assertEquals(expected, employee.toString());
    }
}