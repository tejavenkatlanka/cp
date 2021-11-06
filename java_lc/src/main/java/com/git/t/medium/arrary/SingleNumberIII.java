package com.git.t.medium.arrary;

public class SingleNumberIII {

  public static void main(String[] args) {
    System.out.println(new SingleNumberIII().singleNumber(new int[]{1, 2, 1, 3, 2, 5}));
  }
//101
//011
  public int[] singleNumber(int[] nums) {
    int xor = 0;
    for (int num : nums) {
      xor = xor ^ num;
    }
    System.out.println(xor);
    int rigMost = xor & (-xor);
    System.out.println(rigMost);

    int newXor = 0;
    for (int num : nums) {
      if ((num & rigMost) != 0) {
        newXor = newXor ^ num;
      }
    }
    System.out.println(newXor);

    return new int[]{newXor, xor ^ newXor};
  }
}
