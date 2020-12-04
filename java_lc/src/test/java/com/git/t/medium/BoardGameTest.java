package com.git.t.medium;

import org.junit.jupiter.api.Test;

class BoardGameTest {

  @Test
  void solve() {
    BoardGame boardGame = new BoardGame();
    boardGame.solve(new char[][]{"XXXX".toCharArray(),
        "XOOX".toCharArray(),
        "XXOX".toCharArray(),
        "XOXX".toCharArray()});
  }
}