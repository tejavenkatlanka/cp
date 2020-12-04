package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class TriangleTest {

  @Test
  void minimumTotal() {
    Triangle triangle = new Triangle();

    assertEquals(11, triangle.minimumTotal(List.of(List.of(2),
        List.of(3, 4), List.of(6, 5, 7), List.of(4, 1, 8, 3))));

  }
}