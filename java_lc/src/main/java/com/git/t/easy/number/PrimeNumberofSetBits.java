package com.git.t.easy.number;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PrimeNumberofSetBits {

  /**
   * 10^6
   * <p>
   * 1000000
   * <p>
   * 0 1 3,5,6,7, 0 1 10 11 100 101 110 111
   *
   * @param left
   * @param right
   * @return
   */
  public int countPrimeSetBits(int left, int right) {
    return IntStream.range(left, right + 1).map(e -> 665772 >> Integer.bitCount(e) & 1).sum();
  }

  public int countPrimeSetBits1(int left, int right) {
    Set<Integer> set = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
    int count = 0;
    for (int i = left; i <= right; i++) {
      int bits = 0;
      for (int num = i; num > 0; num >>= 1) {
        bits += num & 1;
      }
      count += set.contains(bits) ? 1 : 0;

    }
    return count;
  }

}
