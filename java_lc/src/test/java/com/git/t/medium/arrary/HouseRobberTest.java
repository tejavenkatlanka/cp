package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HouseRobberTest {

  @Test
  void rob() {
    HouseRobber houseRobber = new HouseRobber();
    assertEquals(3, houseRobber.rob(new int[]{2, 3, 2}));
  }
}