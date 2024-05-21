package com.sparta.ed;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static List<String> employeesString = new ArrayList<>();

    public static List<String> readEmployeesFromFile(String fileName){
        Path thePath = Paths.get(fileName);
        String employee;

        try(BufferedReader reader = Files.newBufferedReader(thePath)){
            //Skipping first line
            reader.readLine();
            while((employee = reader.readLine()) != null){
                employeesString.add(employee);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return employeesString;
    }

    public static Employee createEmployee(String line){
        Employee createdEmployee;
        String[] lineSplit = line.replace(" ", "").split(",");
        String empID = lineSplit[0];
        String title = lineSplit[1];
        String firstName = lineSplit[2];
        String middleName = lineSplit[3];
        String lastName = lineSplit[4];
        String gender = lineSplit[5];
        String email = lineSplit[6];
        String dob = lineSplit[7];
        String dateJoined = lineSplit[8];
        String salary = lineSplit[9];

        createdEmployee = new Employee(empID, title,firstName,middleName,lastName,gender,email,dob,dateJoined,salary);
        return createdEmployee;

    }

}
