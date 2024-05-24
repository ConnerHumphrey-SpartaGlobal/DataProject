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
    @ValueSource(strings = {"john.doe@email.com", "john&jane@email.com", "juliette.rojo@yahoo.co.uk", "serafina.bumgarner@exxonmobil.com"})
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
    @ValueSource(strings = {"01/01/2000", "12/05/1990", "02/14/2010", "05/08/1967", "9/21/1982"})
    @DisplayName("Validate dob")
    public void validDOB(String dob) {
        Assertions.assertTrue(VariableValidation.validateDob(dob));
    }

    @ParameterizedTest
    @ValueSource(strings = {"13/01/2000", "12/40/1990", "2-14-2010"})
    @DisplayName("invalidate dob")
    public void invalidDOB(String dob) {
        Assertions.assertFalse(VariableValidation.validateDob(dob));
    }

    @ParameterizedTest
    @ValueSource(strings = {"01/01/2000", "12/05/1990", "02/14/2010", "06/04/2011"})
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
    @ValueSource(strings = {"50000", "210000", "30", "193912"})
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

    @ParameterizedTest
    @ValueSource(strings = {"647173", "260736", "207808", "178566"})
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
    void testValidFirstName() {
        String validFirstName = "Juliette";
        Assertions.assertTrue(VariableValidation.validateFirstName(validFirstName));
    }

    @Test
    void testFirstNameWithNumbers() {
        String firstNameWithNumbers = "Michael123";
        Assertions.assertFalse(VariableValidation.validateFirstName(firstNameWithNumbers));
    }

    @Test
    void testFirstNameWithSpecialCharacters() {
        String firstNameWithSpecialCharacters = "Sarah!";
        Assertions.assertFalse(VariableValidation.validateFirstName(firstNameWithSpecialCharacters));
    }

    @Test
    void testInitialWithSpecialCharacters() {
        String initialWithSpecialCharacters = "B.";
        Assertions.assertFalse(VariableValidation.validateInitial(initialWithSpecialCharacters));
    }

    @Test
    void testValidInitial() {
        String validInitial = "M";
        Assertions.assertTrue(VariableValidation.validateInitial(validInitial));
    }

    @Test
    void testValidLastName() {
        String validFirstName = "Rojo";
        Assertions.assertTrue(VariableValidation.validateFirstName(validFirstName));
    }

    @Test
    void testLastNameWithNumbers() {
        String firstNameWithNumbers = "Smith123";
        Assertions.assertFalse(VariableValidation.validateFirstName(firstNameWithNumbers));
    }

    @Test
    @DisplayName("Overall validation check test using 178566,Mrs.,Juliette,M,Rojo,F,juliette.rojo@yahoo.co.uk,05/08/1967,06/04/2011,193912")
    void overallValidationCheckUsingAboveEmployeeExpectedTrue(){
        String employee = "178566,Mrs.,Juliette,M,Rojo,F,juliette.rojo@yahoo.co.uk,05/08/1967,06/04/2011,193912";
        Assertions.assertTrue(VariableValidation.validateEmployee(employee));
    }


}
