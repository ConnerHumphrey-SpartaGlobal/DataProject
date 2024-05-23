package com.sparta.ed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class VariableValidationTests {

    @ParameterizedTest
    @ValueSource(strings = {"F", "f", "M", "m"})
    @DisplayName("Validate valid gender")
    public void validateGenderValid(String gender) {
        Assertions.assertTrue(VariableValidation.validateGender(gender));
    }

    @ParameterizedTest
    @ValueSource(strings = {"$", "good", "n", "tests"})
    @DisplayName("Validate valid gender")
    public void invalidateGender(String gender) {
        Assertions.assertFalse(VariableValidation.validateGender(gender));
    }

    @ParameterizedTest
    @ValueSource(strings = {"john.doe@email.com", "john&jane@email.com"})
    @DisplayName("Validate valid email")
    public void validEmail(String email) {
        Assertions.assertTrue(VariableValidation.validateEMail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"john.doeemail.com", "john&jane@com", "emailTests"})
    @DisplayName("Validate valid email")
    public void invalidEmail(String email) {
        Assertions.assertFalse(VariableValidation.validateEMail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"01/01/2000", "12/05/1990", "02/14/2010"})
    @DisplayName("Validate dob")
    public void validDOB(String dob) {
        Assertions.assertTrue(VariableValidation.validateDob(dob));
    }

    @ParameterizedTest
    @ValueSource(strings = {"13/01/2000", "12/40/1990", "02-14-2010"})
    @DisplayName("invalidate dob")
    public void invalidDOB(String dob) {
        Assertions.assertFalse(VariableValidation.validateDob(dob));
    }

    @ParameterizedTest
    @ValueSource(strings = {"01/01/2000", "12/05/1990", "02/14/2010"})
    @DisplayName("Validate dateJoined")
    public void validDateJoined(String dateJoined) {
        Assertions.assertTrue(VariableValidation.validateJoiningDate(dateJoined));
    }

    @ParameterizedTest
    @ValueSource(strings = {"13/01/2000", "12/40/1990", "02-14-2010"})
    @DisplayName("invalidate dateJoined")
    public void invalidDateJoined(String dateJoined) {
        Assertions.assertFalse(VariableValidation.validateJoiningDate(dateJoined));
    }

    @ParameterizedTest
    @ValueSource(strings = {"50000", "210000", "30"})
    @DisplayName("valid salary")
    public void validSalary(String salary) {
        Assertions.assertTrue(VariableValidation.validateSalary(salary));
    }

    @ParameterizedTest
    @ValueSource(strings = {"five000", "$2000", ""})
    @DisplayName("valid salary")
    public void invalidSalary(String salary) {
        Assertions.assertFalse(VariableValidation.validateSalary(salary));
    }
}
