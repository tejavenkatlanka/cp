package com.git.t.easy.string;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

  @Test
  void validPalindrome() {
    ValidPalindrome validPalindrome = new ValidPalindrome();
    assertTrue(validPalindrome.validPalindrome("abca"));
  }

  @Test
  void isPalindrome() {
    ValidPalindrome validPalindrome = new ValidPalindrome();
    assertTrue(validPalindrome.isPalindrome("abc", 0, 2));
  }
}