package com.git.t.easy.string;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RobotReturnTest {

  @Test
  void judgeCircle() {
    RobotReturn robotReturn = new RobotReturn();
    assertTrue(robotReturn.judgeCircle("UD"));
  }
}