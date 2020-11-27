package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LHSTest {

  @Test
  void findLHS() {
    LHS lhs=new LHS();

    assertEquals(5,lhs.findLHS(new int[]{1,3,2,2,5,2,3,7}));
  }
}