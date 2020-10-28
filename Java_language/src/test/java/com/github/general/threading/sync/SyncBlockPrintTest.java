package com.github.general.threading.sync;

import com.github.general.common.util.ThreadUtils;

class SyncBlockPrintTest {

    @org.junit.jupiter.api.Test
    void run() throws InterruptedException {

        SyncBlockPrint obj = new SyncBlockPrint();
        System.out.println("active count " + Thread.activeCount());
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