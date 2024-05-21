package com.sparta.ed;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EmployeeManagerTests {
    public String myPath = "src/main/resources/employees.csv";


    @Test
    @DisplayName("Ensuring the array given out by readEmployeesFromFile is the correct size given the employee csv")
    void employeeManagerSizeOfArrayTest(){
        Assertions.assertEquals(10000, EmployeeManager.readEmployeesFromFile(myPath).size());
    }

    @Test
    @DisplayName("createEmployee test ensuring employee is created properly given 198429,\t\"Mrs.\",\"Serafina\", 'I', \"Bumgarner\",'F',\t\"serafina.bumgarner@exxonmobil.com\",\"9/21/1982\",\t\"2/1/2008\",69294 as input")
    void createEmployeeTestGivenAboveInput(){
        Employee expectedEmployee = new Employee("198429",	"Mrs.","Serafina", "I", "Bumgarner","F",	"serafina.bumgarner@exxonmobil.com","9/21/1982",	"2/1/2008","69294");
        Employee actualEmployee = EmployeeManager.createEmployee("198429,Mrs.,Serafina,I,Bumgarner,F,serafina.bumgarner@exxonmobil.com,9/21/1982,2/1/2008,69294");

        Assertions.assertEquals(expectedEmployee.toString(), actualEmployee.toString());
    }

}
