package com.github.general.threading.deadlock;

public class Worker1 implements  Runnable {
    @Override
    public void run() {
        synchronized (Object.class) {
            System.out.println(Thread.currentThread().getName() + " has acquired "
                    + "lock on Object class and waiting to acquire lock on String class...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {e.printStackTrace();}


            synchronized (String.class) {
                System.out.println(Thread.currentThread().getName() +
                        " has acquired lock on String class");
            }
        }

        System.out.println(Thread.currentThread().getName()+ " has ENDED");
    }
}
