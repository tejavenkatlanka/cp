package com.git.t.easy.array;

public class LemonadeChange {

  public boolean lemonadeChange(int[] bills) {
    int five = 0, ten = 0, twenty = 0;
    for (int bill : bills
    ) {
      if (bill == 5) {
        five++;
      } else if (bill == 10) {
        ten++;
        five--;

      } else {
        twenty++;
        if (ten > 1) {
          ten--;
          five--;
        } else {
          five -= 2;
        }

      }
      if (five < 0) {
        return false;
      }

    }
    return true;
  }
}
