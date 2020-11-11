package com.git.t.easy.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PerfectNumberTest {

    @Test
    void checkPerfectNumber() {
        PerfectNumber number =new PerfectNumber();

        assertTrue(number.checkPerfectNumber(6));
    }
}