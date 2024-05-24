package com.sparta.ed;

public class App {
    public static void main(String[] args) {
        //Employee conner = new Employee(198429,	"Mrs.","Serafina", 'I', "Bumgarner",'F',	"serafina.bumgarner@exxonmobil.com","9/21/1982",	"2/1/2008",69294);
        //System.out.println(conner.toString());
        EmployeeManager eManager = new EmployeeManager();
        eManager.readFileLines("src/main/resources/sampleEmployees.csv");
        System.out.println(eManager.getFaultyEmployees().size());
    }
}
