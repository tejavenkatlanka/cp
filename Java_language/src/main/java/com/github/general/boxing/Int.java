package com.github.general.boxing;

public class Int {

  public Integer getAutoBoxing(int n) {
    return n;
  }

  public Integer getByValueOf(int n) {
    return Integer.valueOf(n);
  }

  public int getAutoUnBoxing(int n) {
    return n;
  }
}
