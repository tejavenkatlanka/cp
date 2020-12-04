package com.git.t.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RepeatedStringTest {

  @Test
  void repeatedSubstringPattern() {
    RepeatedString repeatedString = new RepeatedString();
    assertEquals(true, repeatedString.repeatedSubstringPattern("abab"));
    assertEquals(false, repeatedString.repeatedSubstringPattern("aba"));
    assertEquals(true, repeatedString.repeatedSubstringPattern("abcabcabcabc"));
    assertEquals(true, repeatedString.repeatedSubstringPattern("ababab"));
    assertEquals(true, repeatedString.repeatedSubstringPattern("bb"));

  }
}