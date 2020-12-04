package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class PathToSumTest {

  @Test
  void pathToSum() {
    PathToSum s = new PathToSum();
    assertEquals(List.of(List.of(5)), s.pathSum(new TreeNode(5), 5));
  }
}