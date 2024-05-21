Part 1 - Reading and creating objects from file
-----------------------------------------------

#### Prerequisite lessons:

* FileIO
* Collaborative Git

In this exercise you will build a small application that reads a .csv file containing information about employees, and creates an `ArrayList` of `Employee` objects from it.

* As a group, set up a private repo called DataProject . Invite your trainer(s) to it.
* Create an IntelliJ project called `Employees` and add it to the `main` branch. Create a `dev` branch from the `main` branch. Make it the _default_ branch
* Create a class, `Employee`, with fields corresponding to the Employee fields in[employees_short.csv](https://github.com/spartaglobal/JavaTestAutomation/blob/main/04_Data/DataMiniproject/employees_short.csv) file. All fields should be of type `String` for now
* Create a class called `EmployeeCsvReader` with the following methods. Write JUnit tests for each method as described below.

```java
// parses a String of Employee information, and constructs and returns an Employee object from it
public Employee createEmployee(String line) {...}
```

The JUnit test should validate that the `Employee` object contains the correct information

```java
// opens and reads a file and returns a ArrayList of Strings, one for each line
public ArrayList<String>  readFileLines(String fileName) {...}
```

The JUnit test should validate that:

* the `ArrayList` has the correct length
* the first String in the list contains the correct information
* the last String in the list contains the correct information

```java
// creates an ArrayList of Employee objects from information stored in a .csv file.
public ArrayList<Employee> readEmployees(String fileName) {...}
```

`readEmployees` should make use of the `readFileLines` and `createEmployee` methods.

The JUnit test should validate that:

* the `ArrayList` has the correct length
* the first `Employee` object in the list contains the correct information
* the last `Employee` object in the list contains the correct information
