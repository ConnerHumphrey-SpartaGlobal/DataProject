package com.sparta.ed;

public class VariableValidation {

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
    public static boolean validateLastName(String lastName){
        String lastNameRegex = "^[A-z]*";
        return lastNameRegex.matches(lastNameRegex);

    }
    public static boolean validateGender(){
        return false;

    }
    public static boolean validateEMail(){
        return false;

    }
    public static boolean validateDob(){
        return false;

    }
    public static boolean validateJoiningDate(){
        return false;
    }
    public static boolean validateSalary(){
        return false;
    }


}
