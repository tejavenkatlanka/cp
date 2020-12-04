package com.github.general.threading.sync;

import com.github.general.common.util.ThreadUtils;
import org.junit.jupiter.api.Test;

class LockAcqTest {

  @Test
  void methodCanCallSameLock() throws InterruptedException {
    CyclicMethod cyclicMethod = new CyclicMethod();
    CyclicMethod cyclicMethod1 = new CyclicMethod();
    LockAcq lockAcq = new LockAcq(cyclicMethod);
    LockAcq lockAcq1 = new LockAcq(cyclicMethod1);

    new Thread(lockAcq).start();
    Thread e = new Thread(lockAcq1);
    e.start();

    e.join();

  }

  @Test
  void methodCanCallSameLock1() throws InterruptedException {
    CyclicMethod cyclicMethod = new CyclicMethod();
    LockAcq lockAcq = new LockAcq(cyclicMethod);
    LockAcq lockAcq1 = new LockAcq(cyclicMethod);

    Thread e = new Thread(lockAcq1, "t2");
    e.start();
    //.setPriority(2);

    new Thread(lockAcq, "t1").start();
    ThreadUtils.printAllThreadDetails();

    e.join();

  }
}