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
    @ValueSource(strings = {"647173", "260736", "207808"})
    @DisplayName("Validate valid employee ID using about inputs, expect true output")
    void validateEmployeeIDExpectingTrue(String iD){
        Assertions.assertTrue(VariableValidation.validateID(iD));
    }

    @ParameterizedTest
    @ValueSource(strings = {"64d173", "26a736", "20780k"})
    @DisplayName("Validate valid employee ID using about inputs, expect False output")
    void validateEmployeeIDExpectingTFalse(String iD){
        Assertions.assertFalse(VariableValidation.validateID(iD));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hon", "Drs", "Mr"})
    @DisplayName("Validate employee name prefix using above inputs Expecting False")
    void validateEmployeePrefixExpectingFalse(String prefix){
        Assertions.assertFalse(VariableValidation.validatePrefix(prefix));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mr.", "Mrs.", "Dr.", "Mx." , "Prof."})
    @DisplayName("Validate employee name prefix using above inputs Expecting True")
    void validateEmployeePrefixExpectingTrue(String prefix){
        Assertions.assertTrue(VariableValidation.validatePrefix(prefix));
    }

    @Test
    public void testValidFirstName() {
        String validFirstName = "Alice";
        Assertions.assertTrue(VariableValidation.validateFirstName(validFirstName));
    }

    @Test
    public void testFirstNameWithNumbers() {
        String firstNameWithNumbers = "Michael123";
        Assertions.assertFalse(VariableValidation.validateFirstName(firstNameWithNumbers));
    }

    @Test
    public void testFirstNameWithSpecialCharacters() {
        String firstNameWithSpecialCharacters = "Sarah!";
        Assertions.assertFalse(VariableValidation.validateFirstName(firstNameWithSpecialCharacters));
    }

    @Test
    public void testInitialWithSpecialCharacters() {
        String initialWithSpecialCharacters = "B.";
        Assertions.assertFalse(VariableValidation.validateInitial(initialWithSpecialCharacters));
    }

    @Test
    public void testValidInitial() {
        String validInitial = "A";
        Assertions.assertTrue(VariableValidation.validateInitial(validInitial));
    }

    @Test
    public void testValidLastName() {
        String validFirstName = "Smith";
        Assertions.assertTrue(VariableValidation.validateFirstName(validFirstName));
    }

    @Test
    public void testLastNameWithNumbers() {
        String firstNameWithNumbers = "Smith123";
        Assertions.assertFalse(VariableValidation.validateFirstName(firstNameWithNumbers));
    }

}
