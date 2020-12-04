package com.git.t.medium.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VersionMatchTest {

  @Test
  void compareVersion1() {
    VersionMatch versionMatch = new VersionMatch();
    assertEquals(0, versionMatch.compareVersion1("1.01", "1.001"));

  }
}