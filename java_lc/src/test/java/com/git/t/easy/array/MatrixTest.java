package com.git.t.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixTest {

    @Test
    void matrixReshape() {
        Matrix matrix=new Matrix();
        assertArrayEquals(new int[][]{{1,2,3,4}},matrix.matrixReshape(new int[][]{{1,2},{3,4}},1,4));
    }
}