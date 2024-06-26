package com.sparta.ed;



import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EmployeeManager {

    private List<String> employeesString = new ArrayList<>();
    public List<String> faultyEmployees = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    private static final Logger logger = Logger.getLogger(EmployeeManager.class.getName());

    public EmployeeManager() {
        try {
            FileHandler fileHandler = new FileHandler("src/main/resources/employeeErrorLog.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IllegalArgumentException | SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readFileLines(String fileName){
        Path thePath = Paths.get(fileName);
        String employee;

        try(BufferedReader reader = Files.newBufferedReader(thePath)){
            //Skipping first line
            reader.readLine();
            while((employee = reader.readLine()) != null){

                if (VariableValidation.validateEmployee(employee)){
                    employeesString.add(employee);
                }
                else{
                    faultyEmployees.add(employee);
                    logger.log(Level.WARNING,"Invalid entry for: " + employee);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return employeesString;
    }

    public Employee createEmployee(String line){
        Employee createdEmployee;
        String[] lineSplit = line.replace(" ", "").split(",");
        int empID = VariableParsing.convertStringToInt(lineSplit[0]);
        String title = lineSplit[1];
        String firstName = lineSplit[2];
        String middleName = lineSplit[3];
        String lastName = lineSplit[4];
        String gender = lineSplit[5];
        String email = lineSplit[6];
        LocalDate dob = VariableParsing.convertStringToDate(lineSplit[7]);
        LocalDate dateJoined = VariableParsing.convertStringToDate(lineSplit[8]);
        int salary = VariableParsing.convertStringToInt(lineSplit[9]);

        createdEmployee = new Employee(empID, title,firstName,middleName,lastName,gender,email,dob,dateJoined,salary);
        return createdEmployee;
    }

    public List<Employee> readEmployees(String fileName){
        readFileLines(fileName);
        for(String employee: employeesString) {
            employees.add(createEmployee(employee));
        }
        return employees;
    }

    public List<String> getFaultyEmployees() {
        return faultyEmployees;
    }
}
