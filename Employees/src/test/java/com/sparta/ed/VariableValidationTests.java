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
}
