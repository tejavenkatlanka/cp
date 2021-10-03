package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class TwoWayParenthesesTest {

  @Test
  void diffWaysToCompute() {
    TwoWayParentheses twoWayParentheses = new TwoWayParentheses();

    assertEquals(List.of(2, 0), twoWayParentheses.diffWaysToCompute1("2-1-1"));

  }
}