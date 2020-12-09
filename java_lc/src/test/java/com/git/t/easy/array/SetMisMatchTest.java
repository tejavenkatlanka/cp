package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SetMisMatchTest {

  @Test
  void findErrorNums() {
    SetMisMatch setMisMatch = new SetMisMatch();
    assertArrayEquals(new int[]{2, 3}, setMisMatch.findErrorNums(new int[]{1, 2, 2, 4}));
    assertArrayEquals(new int[]{2, 3}, setMisMatch.findErrorNums(new int[]{2, 3, 2}));

  }
}