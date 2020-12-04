package com.github.general.common.lam;

public interface Sys {

  static void defaultPrint(Object o) {
    System.out.println(o);
  }

  void println(Object o);

}
