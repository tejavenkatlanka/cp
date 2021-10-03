package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class FindNumberTest {

  @Test
  void findDisappearedNumbers() {
    FindNumber number = new FindNumber();

    assertEquals(List.of(5, 6), number.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));

  }
}