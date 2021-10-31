package com.git.t.easy.array;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {

  public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int aSum = sum(aliceSizes), bSum = sum(bobSizes);

    int diff = (aSum - bSum) / 2;
    Set<Integer> aCache = new HashSet<>();
    for (int a : aliceSizes
    ) {
      aCache.add(a);
    }
    for (int i = 0; i < bobSizes.length; i++) {
      if (aCache.contains(bobSizes[i] + diff)) {
        return new int[]{bobSizes[i] + diff, bobSizes[i]};
      }
    }
    return  null;
  }

  private int sum(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }


}
