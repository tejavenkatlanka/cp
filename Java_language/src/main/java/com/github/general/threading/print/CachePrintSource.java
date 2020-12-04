package com.github.general.threading.print;

import com.github.general.common.lam.Sys;
import java.util.concurrent.Semaphore;

public class CachePrintSource extends PrintSource {

  private final Semaphore odd = new Semaphore(1);
  private final Semaphore eve = new Semaphore(0);
  Sys sys = Sys::defaultPrint;
  private StringBuilder builder = new StringBuilder();

  public void printNumber(int obj) {
    try {
      if (obj % 2 == 0) {
        eve.acquire();
      } else {
        odd.acquire();
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    builder.append(obj).append("\n");
    if (obj % 2 == 1) {
      eve.release();
    } else {
      odd.release();

    }
  }

  public void flush() {
    sys.println(builder.toString());
    builder = new StringBuilder();
  }
}
