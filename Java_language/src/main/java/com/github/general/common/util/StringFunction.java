package com.github.general.common.util;

@FunctionalInterface
public interface StringFunction {

  static String staCalculateMemory(long n) {
    return " memory (bytes): " +
        n + "  (kb ): " + (n / 1000.0) + " (mb) : " + (n / (1000 * 1000.0)) + " (gb) : " + (n / (
        1000 * 1000 * 1000.0));

  }

  // abstract method
  String calculateMemory(long n);

  default String defCalculateMemory(long n) {
    return " memory (bytes): " +
        n + "  (kb ): " + (n / 1000.0) + " (mb) : " + (n / (1000 * 1000.0)) + " (gb) : " + (n / (
        1000 * 1000 * 1000.0));

  }
}
