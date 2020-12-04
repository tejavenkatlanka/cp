package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReversePolishNotationTest {

  @Test
  void evalRPN() {
    ReversePolishNotation polishNotation = new ReversePolishNotation();
    assertEquals(9, polishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    assertEquals(6, polishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
    assertEquals(22, polishNotation.evalRPN(
        new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
  }
}