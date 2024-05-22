package com.sparta.ed;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagerTests {
    public String myPath = "src/main/resources/employees.csv";
    public String myWrongPath = "src/main/resources/employees1.csv";
    public List<Employee> employees;
    public EmployeeManager employeeManager;

    @BeforeEach
    void setUpAll() {
        employeeManager = new EmployeeManager();
    }

    @Test
    @DisplayName("Ensuring the array given out by readEmployeesFromFile is the correct size given the employee csv")
    void employeeManagerSizeOfArrayTest(){
        Assertions.assertEquals(10000, employeeManager.readFileLines(myPath).size());
    }

    @Test
    @DisplayName("readEmployeesFromFile test checking the first string is what it should be using 198429,Mrs.,Serafina,I,Bumgarner,F,serafina.bumgarner@exxonmobil.com,9/21/1982,02/01/2008,69294")
    void readEmployeesFromFileFirstEmployeeTest(){
        String employee = "198429,Mrs.,Serafina,I,Bumgarner,F,serafina.bumgarner@exxonmobil.com,9/21/1982,02/01/2008,69294";
        var list = employeeManager.readFileLines(myPath);
        Assertions.assertEquals(employee, list.get(0));
    }

    @Test
    @DisplayName("readEmployeesFromFile test checking the last string is what it should be using 133641,Mr.,Chas,F,Hurdle,M,chas.hurdle@gmail.com,4/20/1995,5/28/2016,45102")
    void readEmployeesFromFileLastEmployeeTest(){
        String employee = "133641,Mr.,Chas,F,Hurdle,M,chas.hurdle@gmail.com,4/20/1995,5/28/2016,45102";
        var list = employeeManager.readFileLines(myPath);
        Assertions.assertEquals(employee, list.get(list.size()-1));
    }

    @Test
    @DisplayName("createEmployee test ensuring employee is created properly given 198429,\t\"Mrs.\",\"Serafina\", 'I', \"Bumgarner\",'F',\t\"serafina.bumgarner@exxonmobil.com\",\"9/21/1982\",\t\"2/1/2008\",69294 as input")
    void createEmployeeTestGivenAboveInput(){
        LocalDate dob = VariableParsing.convertStringToDate("9/21/1982");
        LocalDate dateJoined = VariableParsing.convertStringToDate("2/1/2008");
        Employee expectedEmployee = new Employee(198429,"Mrs.","Serafina","I", "Bumgarner","F",	"serafina.bumgarner@exxonmobil.com",dob,dateJoined,69294);
        Employee actualEmployee = employeeManager.createEmployee("198429,Mrs.,Serafina,I,Bumgarner,F,serafina.bumgarner@exxonmobil.com,9/21/1982,2/1/2008,69294");

        Assertions.assertEquals(expectedEmployee.toString(), actualEmployee.toString());
    }

    @Test
    @DisplayName("readEmployees - correct size of arraylist")
    void readEmployeesSizeOfArrayTest(){
        Assertions.assertEquals(10000, employeeManager.readEmployees(myPath).size());
    }

    @Test
    @DisplayName("readEmployees - correct first employee")
    void readEmployeesCorrectFirstEmployee(){
        employees = employeeManager.readEmployees(myPath);
        LocalDate dob = VariableParsing.convertStringToDate("9/21/1982");
        LocalDate dateJoined = VariableParsing.convertStringToDate("02/01/2008");
        Employee expectedEmployee = new Employee(198429,"Mrs.","Serafina","I","Bumgarner","F","serafina.bumgarner@exxonmobil.com",dob,dateJoined,69294);
        Employee firstEmployee = employees.get(0);
        Assertions.assertEquals(expectedEmployee.toString(), firstEmployee.toString());
    }
    @Test
    @DisplayName("readEmployees - correct last employee")
    void readEmployeesCorrectLastEmployee(){
        employees = employeeManager.readEmployees(myPath);
        LocalDate dob = VariableParsing.convertStringToDate("4/20/1995");
        LocalDate dateJoined = VariableParsing.convertStringToDate("5/28/2016");
        Employee expectedEmployee = new Employee(133641,"Mr.","Chas","F","Hurdle","M","chas.hurdle@gmail.com",dob,dateJoined,45102);
        Employee lastEmployee = employees.get(employees.size()-1);
        Assertions.assertEquals(expectedEmployee.toString(), lastEmployee.toString());
    }
}
