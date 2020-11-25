package com.git.t.easy.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextNumber {

  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    Stack<Integer> stack = new Stack<>();
    for (int i : nums2) {
      while (!stack.isEmpty() && stack.peek() < i) {
        map.put(stack.pop(), i);
      }
      stack.push(i);
    }
    int ret[] = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      ret[i] = map.getOrDefault(nums1[i], -1);
    }
    return ret;

  }
}
