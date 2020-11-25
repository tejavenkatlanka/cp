package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.easy.array.ArrayMoves;
import org.junit.jupiter.api.Test;

class ArrayMovesTest {

  @Test
  void minMoves() {
    ArrayMoves arrayMoves = new ArrayMoves();
    assertEquals(3, arrayMoves.minMoves(new int[]{1, 2, 3}));
  }
}