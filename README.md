# Sparta Global Data Project

The aim of this project is to use Git in a collaborative way, as well as to gain practical experience in handling files, and creating objects from file data.

This applicate reads a .csv file containing information about employees, and creates an `ArrayList` of `Employee` objects from it.

# Tech/Framework

Written in java and testing in JUnit

# Project Structure

## Employee Class

- Represents an employee with fields corresponding to the columns in the .csv file

## EmployeeManagement Class

- Handles read the .csv file and creating Employee objects
- Methods in this class:
  - _createEmployee_: parses a line of employee data, and returns an employee object
  - _readEmployeesFromFile_: reads the .csv file line by line and returns an ArrayList of Strings
  - _readEmployees_: Creates an ArrayList of Employee objects from the .csv file, using the _createEmployee_ and _readEmployeesFromFile_ methods.

# Getting started

- Clone the repo

```
git clone https://github.com/ConnerHumphrey-SpartaGlobal/DataProject.git
```

```
cd DataProject
```

- Open the Employees project in IntelliJ IDEA

- IntelliJ will automatically detect the Maven Project and start downloading the dependencies

- Switch to the dev branch

```
git checkout dev
```
