package com.sparta.ed;

import java.time.LocalDate;

public class VariableValidation {

    public static boolean validateEmployee(String employee){
        String[] lineSplit = employee.replace(" ", "").split(",");
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

        return (validateID(empID) && validatePrefix(title)
                && validateFirstName(firstName) && validateInitial(middleName)
                && validateLastName(lastName) && validateGender(gender)
                && validateEMail(email) && validateDob(dob)
                && validateJoiningDate(dateJoined) && validateSalary(salary));
    }

    public static boolean validateID(String empID){
        String iDRegex = "[0-9]{6}";

        return empID.matches(iDRegex);

    }
    public static boolean validatePrefix(String title){
        String titleRegex = "^(?:Mr|Mrs|Ms|Dr|Mx|Prof)\\.";

        return title.matches(titleRegex);

    }
    public static boolean validateFirstName(String firstName){
        String firstNameRegex = "^[A-z]*";

        return firstName.matches(firstNameRegex);

    }
    public static boolean validateInitial(String initial){
        String initialRegex = "^[A-Z]";

        return initial.matches(initialRegex);

    }
    public static boolean validateLastName(String lastName) {
        String lastNameRegex = "^[A-z]*";

        return lastName.matches(lastNameRegex);
    }

    public static boolean validateGender(String gender){
        String regex = "^[FfMm]$";

        return gender.matches(regex);
    }
    public static boolean validateEMail(String validateEmail){
        String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

        return validateEmail.matches(regex);
    }
    public static boolean validateDob(String dob){
        String regex = "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/[0-9]{4}$";

        return dob.matches(regex);
    }

    public static boolean validateJoiningDate(String dob){
        String regex = "^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/[0-9]{4}$";

        return dob.matches(regex);
    }

    public static boolean validateSalary(String salary){
        String regex = "^[0-9]+$";

        return salary.matches(regex);

    }

}
