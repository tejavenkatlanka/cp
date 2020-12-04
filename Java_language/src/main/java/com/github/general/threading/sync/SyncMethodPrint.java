package com.github.general.threading.sync;

import com.github.general.common.util.ThreadUtils;

public class SyncMethodPrint implements Runnable {

  @Override
  public void run() {
    ThreadUtils.printAllThreadDetails();

    doWork();
  }

  public synchronized void doWork() {
    ThreadUtils.printAllThreadDetails();

    ThreadUtils.printNumberFor(1000);
  }
}
