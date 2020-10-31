package com.github.general.threading.sync;

import com.github.general.common.util.ThreadUtils;

public class CyclicMethod {
 Integer lock=Integer.valueOf(0) ;
    Integer lock1=Integer.valueOf(0) ;

    public  void doJob(){
        reqJob(0);
    }

    private   void reqJob(int i){

        synchronized (lock) {
            if (i < 3) {

                ThreadUtils.printThreadDetails(Thread.currentThread());
               ThreadUtils.joinCurrentThread();
                reqJob1(0);
                reqJob(i + 1);

            }
        }
    }

    private   void reqJob1(int i){
        //Lock
        synchronized (lock) {
            if (i < 3) {
                ThreadUtils.printThreadDetails(Thread.currentThread());
                //  ThreadUtils.join();
                //reqJob(i + 1);

            }
        }
    }
}
