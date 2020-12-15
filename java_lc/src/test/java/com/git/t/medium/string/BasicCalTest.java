package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BasicCalTest {

  @Test
  void calculate() {
    BasicCal cal = new BasicCal();

    assertEquals(7, cal.calculate("3+2*2"));
  }

  @Test
  void calculate0() {
    BasicCal cal = new BasicCal();

    assertEquals(7, cal.calculate0("3+2*2"));
  }
}