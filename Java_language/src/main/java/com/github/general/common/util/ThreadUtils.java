package com.github.general.common.util;

import com.github.general.common.lam.Sys;

public class ThreadUtils {
    static Sys s = Sys::defaultPrint;

    public static void joinCurrentThread() {
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void join(Thread t) {
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void printThreadDetails(Thread thread) {
        s.println("----------------------------------------------------");
        s.println("thread name " + thread.getName());
        s.println("thread ContextClassLoader " + thread.getContextClassLoader());
        s.println("thread priority " + thread.getPriority());
        s.println("thread state " + thread.getState());
        s.println("thread thread group  " + thread.getThreadGroup());
        s.println("thread UncaughtExceptionHandler " + thread.getUncaughtExceptionHandler());
        s.println("----------------------------------------------------");

    }

    public static void printAllThreadDetails() {
        s.println("::::::::::::::::::::called inside start :-> " + Thread.currentThread().getName() + "::::::::::::::::::::::");
        for (Thread t : Thread.getAllStackTraces().keySet()
        ) {

            ThreadUtils.printThreadDetails(t);


        }
        s.println("::::::::::::::::::::called inside  end :-> " + Thread.currentThread().getName() + "::::::::::::::::::::::");

    }

    public static void printNumberFor(long millis) {
        for (int i = 0; i < 5; i++) {
            s.println("name : " + Thread.currentThread().getName() + " is executing " +
                    "active threads " + Thread.activeCount());
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
