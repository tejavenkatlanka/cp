package com.git.ds.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class VectorTest {

  @Test
  void add() {
    Vector vector = new Vector();
    IntStream.range(0, 10).forEach(vector::add);
    assertEquals(8, vector.get(8));
  }

  @Test
  void get() {
    Vector vector = new Vector();
    IntStream.range(0, 10).forEach(vector::add);
    assertEquals(8, vector.get(8));
  }

  @Test
  void delete() {
    Vector vector = new Vector();
    IntStream.range(0, 10).forEach(vector::add);
    vector.delete(2);
    assertEquals(9, vector.size());
    vector.delete(0);
    assertEquals(8, vector.size());

  }
}