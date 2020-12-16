package com.git.t.medium.arrary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class MajorityElementTest {

  @Test
  void majorityElement() {
    MajorityElement majorityElement = new MajorityElement();

    assertEquals(List.of(3), majorityElement.majorityElement(new int[]{3, 2, 3}));
    assertEquals(List.of(1), majorityElement.majorityElement(new int[]{2, 1, 3, 4, 1, 5, 6, 1}));

  }


}