package com.github.general.common.util;

import com.github.general.common.lam.Sys;

public class SystemUtils {


  public static void printMem() {
    Sys sys = Sys::defaultPrint;
    sys.println("Available processors (cores): " +
        Runtime.getRuntime().availableProcessors());
    final long freeMemory = Runtime.getRuntime().freeMemory();
    final StringFunction buildMemory = StringFunction::staCalculateMemory;
    sys.println("Free memory (bytes): " + buildMemory.calculateMemory(freeMemory) + " ");

    long maxMemory = Runtime.getRuntime().maxMemory();
    sys.println("Maximum memory (bytes): " +
        (maxMemory == Long.MAX_VALUE ? "no limit" : buildMemory.calculateMemory(maxMemory)));

    sys.println("Total memory (bytes): " +
        buildMemory.calculateMemory(Runtime.getRuntime().totalMemory()));

  }
}
