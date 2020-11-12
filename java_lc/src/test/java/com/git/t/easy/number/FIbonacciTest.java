package com.git.t.easy.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FIbonacciTest {

    @Test
    void fib() {
        FIbonacci fIbonacci = new FIbonacci();

        assertEquals(1, fIbonacci.fib(2));
        assertEquals(2, fIbonacci.fib(3));

        assertEquals(3, fIbonacci.fib(4));


    }

    @Test
    void fibBymatric() {
        FIbonacci fIbonacci = new FIbonacci();

        assertEquals(1, fIbonacci.fibBymatric(2));
        assertEquals(2, fIbonacci.fibBymatric(3));

        assertEquals(3, fIbonacci.fibBymatric(4));
    }
}