package com.github.general.threading.sync;

public class LockAcq implements Runnable {

  CyclicMethod cyclicMethod;

  public LockAcq(CyclicMethod cyclicMethod) {
    this.cyclicMethod = cyclicMethod;
  }

  @Override
  public void run() {
    cyclicMethod.doJob();
  }
}
