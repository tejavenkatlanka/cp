package com.git.t.medium.string;

import java.util.HashMap;

public class FractionToDecimal {

  public String fractionToDecimal(int numerator, int denominator) {
    if (numerator == 0) {
      return "0";
    }
    StringBuilder response = new StringBuilder();
    response.append((numerator > 0) ^ (denominator > 0) ? "-" : "");
    long num = Math.abs(numerator);
    long den = Math.abs(denominator);
    response.append(num / den);
    num %= den;
    if (num == 0) {
      return response.toString();
    }
    response.append(".");
    HashMap<Long, Integer> hashMap = new HashMap<>();
    hashMap.put(num, response.length());
    while (num != 0) {
      num *= 10;
      response.append((num / den));
      num %= den;
      if (hashMap.containsKey(num)) {
        int index = hashMap.get(num);
        response.insert(index, "(");
        response.append(")");
        break;
      } else {
        hashMap.put(num, response.length());
      }

    }
    return response.toString();
  }
}



