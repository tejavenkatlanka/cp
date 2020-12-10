package com.git.t.medium.list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class CombinationSumTest {

  @Test
  void combinationSum3() {
    CombinationSum combinationSum = new CombinationSum();
    assertEquals(List.of(List.of(1, 2, 4)), combinationSum.combinationSum3(3, 7));
  }
}