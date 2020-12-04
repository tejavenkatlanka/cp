package com.github.general.threading.sync;

import com.github.general.common.util.ThreadUtils;
import org.junit.jupiter.api.Test;

class SyncMethodPrintTest {

  @Test
  void run() throws InterruptedException {

    SyncMethodPrint obj = new SyncMethodPrint();
    Thread t1 = new Thread(obj, "Thread-1");
    Thread t2 = new Thread(obj, "Thread-2");
    t1.start();
    t2.start();
    System.out.println("active count " + Thread.activeCount());

    System.out.println("active count " + Thread.activeCount());
    ThreadUtils.printAllThreadDetails();

    t2.join();

  }
}