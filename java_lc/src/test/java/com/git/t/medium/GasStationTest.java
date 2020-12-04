package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GasStationTest {

  @Test
  void canCompleteCircuit() {
    GasStation station = new GasStation();
    assertEquals(3, station.canCompleteCircuit(new int[]{1, 2, 3, 4, 5},
        new int[]{3, 4, 5, 1, 2}));
  }
}