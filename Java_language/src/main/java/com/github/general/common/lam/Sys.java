package com.github.general.common.lam;

public interface Sys {
     void  println(Object o);

     static void defaultPrint(Object o){
         System.out.println(o);
     }

}
