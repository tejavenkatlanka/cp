package com.github.general.threading.print;

import org.junit.jupiter.api.Test;

class PrintJobTest {

  @Test
  void printNumberSeq() {
    PrintJob printJob = new PrintJob();

    printJob.printNumberSeq(100);
  }
}