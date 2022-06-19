package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NegativeNumberCheckerTest {

    private NegativeNumberChecker negativeNumberChecker;

    @BeforeEach
    void setUp() {
        negativeNumberChecker = new NegativeNumberChecker();
    }

    @ParameterizedTest(name = "isNegativeNumber({arguments})")
    @ValueSource(ints = {Integer.MIN_VALUE, -100, -50, -10})
    void isNegativeNumber(int number) {
        Assertions.assertTrue(negativeNumberChecker.isNegativeNumber(number));
    }
}