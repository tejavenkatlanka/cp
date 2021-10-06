package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class FindDuplicateTest {

  @Test
  void findDuplicates() {
    FindDuplicate findDuplicate = new FindDuplicate();
    List<Integer> act = findDuplicate.findDuplicates(new int[]{4,3,2,7,8,2,3,1});
    assertEquals(List.of(2,3), act);
  }
}