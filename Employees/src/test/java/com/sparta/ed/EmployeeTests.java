package com.sparta.ed;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class EmployeeTests {
    private Employee employee;

    @BeforeEach
    public void setUpAll() {
        employee = new Employee("1", "Mr.", "Conner", "A.", "Humphries", "M", "c.humphries@example.com", "01-01-2000", "21-05-2024", "50000");
    }

    @Test
    @DisplayName("Get First Name")
    public void testGetFirstName() {
        Assertions.assertEquals("Conner", employee.getFirstName());
    }

    @Test
    @DisplayName("Set First Name")
    public void testSetFirstName() {
        employee.setFirstName("Jane");
        Assertions.assertEquals("Jane", employee.getFirstName());
    }

    @Test
    @DisplayName("Get Last Name")
    public void testGetLastName() {
        Assertions.assertEquals("Humphries", employee.getLastName());
    }

    @Test
    @DisplayName("Set Last Name")
    public void testSetLastName() {
        employee.setLastName("Smith");
        Assertions.assertEquals("Smith", employee.getLastName());
    }

    @Test
    @DisplayName("Get Gender")
    public void testGetGender() {
        Assertions.assertEquals("M", employee.getGender());
    }

    @Test
    @DisplayName("Set Gender")
    public void testSetGender() {
        employee.setGender("F");
        Assertions.assertEquals("F", employee.getGender());
    }

    @Test
    @DisplayName("Get Email")
    public void testGetEmail() {
        Assertions.assertEquals("c.humphries@example.com", employee.getEmail());
    }

    @Test
    @DisplayName("Set Email")
    public void testSetEmail() {
        employee.setEmail("jane.doe@example.com");
        Assertions.assertEquals("jane.doe@example.com", employee.getEmail());
    }

    @Test
    @DisplayName("Get Date of Birth")
    public void testGetDob() {
        Assertions.assertEquals("01-01-2000", employee.getDob());
    }

    @Test
    @DisplayName("Set Date of Birth")
    public void testSetDob() {
        employee.setDob("1985-12-25");
        Assertions.assertEquals("1985-12-25", employee.getDob());
    }

    @Test
    @DisplayName("Get Date Joined")
    public void testGetDateJoined() {
        Assertions.assertEquals("21-05-2024", employee.getDateJoined());
    }

    @Test
    @DisplayName("Set Date Joined")
    public void testSetDateJoined() {
        employee.setDateJoined("01-01-2024");
        Assertions.assertEquals("01-01-2024", employee.getDateJoined());
    }

    @Test
    @DisplayName("Get Salary")
    public void testGetSalary() {
        Assertions.assertEquals("50000", employee.getSalary());
    }

    @Test
    @DisplayName("Set Salary")
    public void testSetSalary() {
        employee.setSalary("60000");
        Assertions.assertEquals("60000", employee.getSalary());
    }


    @Test
    @DisplayName("Employee ToString")
    public void testToString() {
        String expected = "Employee{empID='1', title='Mr.', firstName='Conner', middleName='A.', lastName='Humphries', gender='M', email='c.humphries@example.com', dob='01-01-2000', dateJoined='21-05-2024', salary='50000'}";
        Assertions.assertEquals(expected, employee.toString());
    }
}