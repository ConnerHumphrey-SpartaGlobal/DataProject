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
        Assertions.assertEquals(10000, employeeManager.readFileLines(myPath).size() + employeeManager.getFaultyEmployees().size());
    }

    @Test
    @DisplayName("readEmployeesFromFile test checking the first string is what it should be using 178566,Mrs.,Juliette,M,Rojo,F,juliette.rojo@yahoo.co.uk,05/08/1967,06/04/2011,193912")
    void readEmployeesFromFileFirstEmployeeTest(){
        String employee = "178566,Mrs.,Juliette,M,Rojo,F,juliette.rojo@yahoo.co.uk,05/08/1967,06/04/2011,193912";
        var list = employeeManager.readFileLines(myPath);
        Assertions.assertEquals(employee, list.get(0));
    }

    @Test
    @DisplayName("readEmployeesFromFile test checking the last string is what it should be using 538924,Mrs.,Hiroko,L,Gupta,F,hiroko.gupta@gmail.com,07/07/1977,09/09/2001,188357")
    void readEmployeesFromFileLastEmployeeTest(){
        String employee = "538924,Mrs.,Hiroko,L,Gupta,F,hiroko.gupta@gmail.com,07/07/1977,09/09/2001,188357";
        var list = employeeManager.readFileLines(myPath);
        Assertions.assertEquals(employee, list.get(list.size()-1));
    }

    @Test
    @DisplayName("createEmployee test ensuring employee is created properly given 198429,\t\"Mrs.\",\"Serafina\", 'I', \"Bumgarner\",'F',\t\"serafina.bumgarner@exxonmobil.com\",\"9/21/1982\",\t\"2/1/2008\",69294 as input")
    void createEmployeeTestGivenAboveInput(){
        LocalDate dob = VariableParsing.convertStringToDate("09/21/1982");
        LocalDate dateJoined = VariableParsing.convertStringToDate("02/01/2008");
        Employee expectedEmployee = new Employee(198429,"Mrs.","Serafina","I", "Bumgarner","F",	"serafina.bumgarner@exxonmobil.com",dob,dateJoined,69294);
        Employee actualEmployee = employeeManager.createEmployee("198429,Mrs.,Serafina,I,Bumgarner,F,serafina.bumgarner@exxonmobil.com,09/21/1982,02/01/2008,69294");

        Assertions.assertEquals(expectedEmployee.toString(), actualEmployee.toString());
    }

    @Test
    @DisplayName("readEmployees - correct size of arraylist")
    void readEmployeesSizeOfArrayTest(){
        Assertions.assertEquals(10000, employeeManager.readEmployees(myPath).size() + employeeManager.getFaultyEmployees().size());
    }

    @Test
    @DisplayName("readEmployees - correct first employee")
    void readEmployeesCorrectFirstEmployee(){

        employees = employeeManager.readEmployees(myPath);
        Employee expectedEmployee = new Employee(178566,"Mrs.","Juliette","M","Rojo","F","juliette.rojo@yahoo.co.uk",LocalDate.of(1967,5,8),LocalDate.of(2011,6,4),193912);
        Employee firstEmployee = employees.get(0);
        Assertions.assertEquals(expectedEmployee.toString(), firstEmployee.toString());
    }
    @Test
    @DisplayName("readEmployees - correct last employee")
    void readEmployeesCorrectLastEmployee(){
        employees = employeeManager.readEmployees(myPath);
        LocalDate dob = VariableParsing.convertStringToDate("07/07/1977");
        LocalDate dateJoined = VariableParsing.convertStringToDate("09/09/2001");
        Employee expectedEmployee = new Employee(538924,"Mrs.","Hiroko","L","Gupta","F","hiroko.gupta@gmail.com",dob,dateJoined,188357);
        Employee lastEmployee = employees.get(employees.size()-1);
        Assertions.assertEquals(expectedEmployee.toString(), lastEmployee.toString());
    }


}
