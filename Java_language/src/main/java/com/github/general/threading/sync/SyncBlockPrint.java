package com.github.general.threading.sync;

import com.github.general.common.util.ThreadUtils;

public class SyncBlockPrint implements Runnable {

    public void run() {
        ThreadUtils.printAllThreadDetails();

        synchronized (this) {
            ThreadUtils.printAllThreadDetails();
            ThreadUtils.printNumberFor(1000);

        }
    }
}
