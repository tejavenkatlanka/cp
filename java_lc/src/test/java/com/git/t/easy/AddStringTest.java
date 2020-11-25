package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.easy.string.AddString;
import org.junit.jupiter.api.Test;

class AddStringTest {

  @Test
  void addStrings() {
    AddString s = new AddString();
    assertEquals("0", s.addStrings("0", "0"));
  }
}