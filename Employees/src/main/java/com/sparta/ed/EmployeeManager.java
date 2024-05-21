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

}
