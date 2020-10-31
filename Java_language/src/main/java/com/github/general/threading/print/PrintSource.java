package com.github.general.threading.print;

import com.github.general.common.lam.Sys;

import java.util.concurrent.Semaphore;

public class PrintSource {

    private Sys sys = Sys::defaultPrint;
    private Boolean isEven=Boolean.FALSE;
    private Boolean isOdd=Boolean.FALSE;
    private Semaphore odd=new Semaphore(1);
    private Semaphore eve=new Semaphore(0);

    public void printNumber(int obj) {
         //odd.
        try {
            if(obj%2==0) {
                eve.acquire();
            }
            else{
                odd.acquire();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sys.println(obj);
        if(obj%2==1){
            isEven=Boolean.TRUE;
            eve.release();
        }
        else {
            isEven=Boolean.FALSE;
            odd.release();

        }


    }

    public void  flush(){
        sys.println("");
    //    builder = new StringBuilder();
    }


}
