package com.sparta.ed;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class VariableParsingTests {

    @Test
    @DisplayName("Converts string to integer")
    public void convertStringToInt() {
        int actual = VariableParsing.convertStringToInt("123");
        Assertions.assertEquals(123, actual);
    }

    @Test
    @DisplayName("Error when converting invalid string to integer")
    public void convertStringToInt_invalidString() {
        try {
            VariableParsing.convertStringToInt("abc");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Employee ID must be a number", e.getMessage());
        }
    }

    @Test
    @DisplayName("Converts string to LocalDate")
    public void convertStringToDate() {
        LocalDate actual = VariableParsing.convertStringToDate("05/22/2024");
        Assertions.assertEquals(LocalDate.of(2024, 5, 22), actual);
    }

    @Test
    @DisplayName("Error when converting invalid string to LocalDate")
    public void convertStringToDate_invalidInput() {
        try {
            VariableParsing.convertStringToDate("abc");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid date format", e.getMessage());
        }
    }
}
