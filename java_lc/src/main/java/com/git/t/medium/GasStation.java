package com.git.t.medium;

public class GasStation {

  public int canCompleteCircuit(int[] gas, int[] cost) {
    int sumGas = 0;
    int sumCost = 0;
    int tankSum = 0;
    int start = 0;
    for (int i = 0; i < gas.length; i++) {
      sumGas += gas[i];
      sumCost += cost[i];
      tankSum += gas[i] - cost[i];
      if (tankSum < 0) {
        start = i + 1;
        tankSum = 0;
      }
    }
    if (sumGas < sumCost) {
      return -1;
    }

    return start;
  }
}
