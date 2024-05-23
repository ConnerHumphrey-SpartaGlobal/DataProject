package com.sparta.ed;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
    public static void main(String[] args) {
        LocalDate dob = VariableParsing.convertStringToDate("9/21/1982");
        LocalDate dateJoined = VariableParsing.convertStringToDate("2/1/2008");
        Employee expectedEmployee = new Employee(198429,"Mrs.","Serafina","I", "Bumgarner","F",	"serafina.bumgarner@exxonmobil.com",dob,dateJoined,69294);
        System.out.println(expectedEmployee.toString());
    }
    private int empID;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String email;
    private LocalDate dob;
    private LocalDate dateJoined;
    private int salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Employee(int empID, String title, String firstName, String middleName, String lastName, String gender, String email, LocalDate dob, LocalDate dateJoined, int salary) {
        this.empID = empID;
        this.title = title;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.dob = dob;
        this.dateJoined = dateJoined;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", dateJoined=" + dateJoined +
                ", salary=" + salary +
                '}';
    }
}
