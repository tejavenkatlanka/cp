package com.github.general.threading.deadlock;

import com.github.general.common.util.ThreadUtils;
import org.junit.jupiter.api.Test;

class DeadLock {

  @Test
  void run() throws InterruptedException {

    Thread thread1 = new Thread(new Worker1(), "Thread-1");
    Thread thread2 = new Thread(new Worker2(), "Thread-2");
    thread1.start();

    thread2.start();

    Thread.sleep(10000);
    ThreadUtils.printAllThreadDetails();
  }
}