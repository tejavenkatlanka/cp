package com.git.t.easy.string.min;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShortestCompletingWordTest {

  @Test
  void shortestCompletingWord() {
    ShortestCompletingWord shortestCompletingWord = new ShortestCompletingWord();
    assertEquals("steps", shortestCompletingWord
        .shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));

    assertEquals("important", shortestCompletingWord
        .shortestCompletingWord("AN87005",
            new String[]{"participant", "individual", "start", "exist", "above", "already", "easy",
                "attack", "player", "important"}));
    assertEquals("lay", shortestCompletingWord
        .shortestCompletingWord("Ay73565",
            new String[]{"effect", "bed", "shoot", "something", "deal", "arm", "crime", "lay",
                "continue", "talk"}));

  }
}