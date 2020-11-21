package com.git.t.medium.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FractionToDecimalTest {

    @Test
    void fractionToDecimal() {
        FractionToDecimal fractionToDecimal=new FractionToDecimal();

        assertEquals("0.5",fractionToDecimal.fractionToDecimal(1,2));

    }
}