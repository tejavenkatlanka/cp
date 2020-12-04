package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.easy.number.HammingDistance;
import org.junit.jupiter.api.Test;

class HummingDistanceTest {

  @Test
  void hammingDistance() {
    HammingDistance distance = new HammingDistance();
    assertEquals(2, distance.hammingDistance(1, 4));
  }
}