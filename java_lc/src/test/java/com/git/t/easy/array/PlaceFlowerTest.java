package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PlaceFlowerTest {

  @Test
  void canPlaceFlowers() {
    PlaceFlower placeFlower = new PlaceFlower();
    assertTrue(placeFlower.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    assertFalse(placeFlower.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    assertFalse(placeFlower.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
  }
}