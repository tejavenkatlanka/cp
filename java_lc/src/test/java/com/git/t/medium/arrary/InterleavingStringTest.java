package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class InterleavingStringTest {

  @Test
  void isInterleave() {
    InterleavingString interleavingString = new InterleavingString();

    assertTrue(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
  }
}