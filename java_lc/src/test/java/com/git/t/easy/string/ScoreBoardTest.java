package com.git.t.easy.string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ScoreBoardTest {

  @Test
  void calPoints() {
    ScoreBoard scoreBoard = new ScoreBoard();

    assertEquals(30, scoreBoard.calPoints(new String[]{"5", "2", "C", "D", "+"}));
  }
}