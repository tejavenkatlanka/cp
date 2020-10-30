package com.git.t.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayMovesTest {

    @Test
    void minMoves() {
        ArrayMoves arrayMoves=new ArrayMoves();
        assertEquals(3,arrayMoves.minMoves(new int[]{1,2,3}));
    }
}