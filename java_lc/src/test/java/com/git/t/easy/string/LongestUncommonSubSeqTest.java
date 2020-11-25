package com.git.t.easy.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestUncommonSubSeqTest {

  @Test
  void findLUSlength() {
    LongestUncommonSubSeq subSeq = new LongestUncommonSubSeq();

    assertEquals(-1, subSeq.findLUSlength("aaa", "aaa"));
    assertEquals(3, subSeq.findLUSlength("aba", "cdc"));

  }
}