package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.git.t.easy.tree.BSTMode;
import org.junit.jupiter.api.Test;

class BSTModeTest {

  @Test
  void findMode() {
    BSTMode mode = new BSTMode();
    assertArrayEquals(new int[]{}, mode.findMode(null));
  }
}