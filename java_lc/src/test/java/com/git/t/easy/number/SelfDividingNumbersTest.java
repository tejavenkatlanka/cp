package com.git.t.easy.number;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;

class SelfDividingNumbersTest {

  @Test
  void selfDividingNumbers() {
    SelfDividingNumbers selfDividingNumber= new SelfDividingNumbers();
    Collection<Integer>  numbers= selfDividingNumber.selfDividingNumbers(1,22);
    Collection<Integer>  expected= Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22);
    assertEquals(expected,numbers);
  }
}