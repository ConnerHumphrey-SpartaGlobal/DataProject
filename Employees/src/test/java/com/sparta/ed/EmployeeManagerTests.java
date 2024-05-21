package com.sparta.ed;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTests {
    public String myPath = "src/main/resources/employees.csv";


    @Test
    @DisplayName("test test")
    void employeeManagerSizeOfArrayTest(){
        Assertions.assertEquals(10000, EmployeeManager.readEmployeesFromFile(myPath).size());
    }

}
