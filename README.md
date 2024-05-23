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

# Part 2 - Data Parsing

The objective is to convert the fields in the _Employee_ class to use more appropriate data stypes instead of String.

We will need to write methods for these type conversions, and call them in the _EmployeeManager_. These conversion methods will throw an exception if the data format is not compatible.

## Implementation

- Update the Employee Class. Fields such as _empID_ will now be an int type and _dob_ and _dateJoined_ to LocalDate

- Implement Conversion Methods. This is separated into a _VariableParsing_ class and consists of the methods:

  - convertStringToInt(String employeeID) - converts String to int
  - onvertStringToDate - converts String to LocalDate

- Update _EmployeeManager_. We can now use the methods in the _VariableParsing_ to convert data types when we _createEmployee_

- Write new and update unit tests

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
