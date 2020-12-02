package com.git.t.easy.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class CommonMatchTest {

  @Test
  void findRestaurant() {
    CommonMatch commonMatch = new CommonMatch();
    assertArrayEquals(new String[]{"Shogun"}, commonMatch
        .findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
            new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse",
                "Shogun"}));
    assertArrayEquals(new String[]{"Shogun"}, commonMatch
        .findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
            new String[]{"KFC", "Shogun", "Burger King"}));
  }
}