package com.git.t.medium.Tree;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class BSTIteratorTest {

  @Test
  void next() {

    BSTIterator iterator = new BSTIterator(null);
    assertFalse(iterator.hasNext());
  }
}