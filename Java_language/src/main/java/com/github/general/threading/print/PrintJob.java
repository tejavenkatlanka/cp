package com.github.general.threading.print;

import com.github.general.common.lam.Sys;
import com.github.general.common.util.ThreadUtils;

public class PrintJob {

  public void printNumberSeq(int num) {
    Sys sys = Sys::defaultPrint;

    PrintSource printSource =
        new CachePrintSource();
    new PrintSource();
    long start = System.nanoTime();
    int step = 2;
    long st = System.nanoTime();
    Object o = new Object();
    synchronized (o) {
      // sys.println("lock d "+(System.nanoTime() - st));
      long en = System.nanoTime();

      sys.println("lock " + (en - st));
    }

    Runnable odd = () -> {
      for (int i = 1; i <= num; i += step) {
        printSource.printNumber(i);
      }

    };
    Runnable even = () -> {
      for (int i = 2; i <= num; i += step) {
        printSource.printNumber(i);
      }

    };
    Thread od = new Thread(odd, "odd");
    Thread eve = new Thread(even, "even");
    od.start();
    eve.start();

    ThreadUtils.join(eve);
    printSource.flush();
    long end = System.nanoTime();
    sys.println("total " + (end - start));
    //15312400 // without order and locks
    // 5795000 // without order and locks and with cache
    //11717800 //
    //14974200 // with locks order
    //18134200 //with cache and locks order
  }

}
