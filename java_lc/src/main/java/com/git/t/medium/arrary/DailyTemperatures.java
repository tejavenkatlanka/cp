package com.git.t.medium.arrary;

import java.util.Stack;

public class DailyTemperatures {

  public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> integers = new Stack<>();
    int[] res = new int[temperatures.length];
    for (int i = 0; i < temperatures.length; i++) {
      while (!integers.isEmpty() && temperatures[i] > temperatures[integers.peek()]) {
        int ind = integers.pop();
        res[ind] = i - ind;
      }
      integers.push(i);
    }
    return res;
  }
}
