package com.git.t.easy.array.matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToeplitzMatrixTest {

  @Test
  void isToeplitzMatrix() {
    ToeplitzMatrix toeplitzMatrix=new ToeplitzMatrix();
    assertTrue(toeplitzMatrix.isToeplitzMatrix(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
  }
}