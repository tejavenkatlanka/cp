package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import org.junit.jupiter.api.Test;

class WordBreakTest {

  @Test
  void wordBreak() {
    WordBreak brea = new WordBreak();
    assertTrue(brea.wordBreak("leetcode", Set.of("leet", "code")));
  }
}