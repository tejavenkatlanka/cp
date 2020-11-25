package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArrangeCoinTest {

  @Test
  void arrangeCoins() {
    ArrangeCoin coin = new ArrangeCoin();
    assertEquals(2, coin.arrangeCoins(5));
  }
}