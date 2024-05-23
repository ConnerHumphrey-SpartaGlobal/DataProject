package com.sparta.ed;

public class VariableValidation {

    public static boolean validateID(){}
    public static boolean validatePrefix(){}
    public static boolean validateFirstName(){}
    public static boolean validateInitial(){}
    public static boolean validateLastName(){}

    public static boolean validateGender(String gender){
        String regex = "^[FfMm]$";
        return gender.matches(regex);
    }
    public static boolean validateEMail(String validateEmail){
        String regex = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+\\])";
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
