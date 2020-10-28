package com.github.general.boxing;

import org.junit.jupiter.api.Test;

class IntTest {

    @Test
    void getAutoBoxing() {
        Int i = new Int();

        Integer nu1 = i.getAutoBoxing(128);
        Integer nu2 = i.getAutoBoxing(128);
        System.out.println("value " + (nu1 == nu2));
        System.out.println("value " + (i.getAutoUnBoxing(nu1) == i.getAutoUnBoxing(nu2)));

        System.out.println("primitive value " + (nu1.intValue() == nu2.intValue()));

        Integer t1 = i.getAutoBoxing(126);
        Integer t2 = i.getAutoBoxing(126);
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (t1.intValue() == t2.intValue()));
        System.out.println("value " + (i.getAutoUnBoxing(t1) == i.getAutoUnBoxing(t2)));

    }

    @Test
    void getByValueOf() {
        Int i = new Int();
        Integer nu1 = i.getByValueOf(128);
        Integer nu2 = i.getByValueOf(128);
        System.out.println("value " + (nu1 == nu2));
        System.out.println("primitive value " + (nu1.intValue() == nu2.intValue()));

        Integer t1 = i.getByValueOf(126);
        Integer t2 = i.getByValueOf(126);
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (t1.intValue() == t2.intValue()));
    }

    @Test
    void testing() {
        Int i = new Int();
        Integer nu1 = i.getByValueOf(128);
        Integer nu2 = i.getAutoBoxing(128);
        System.out.println("value " + (nu1 == nu2));
        System.out.println("primitive value " + (nu1.intValue() == nu2.intValue()));

        Integer t1 = i.getByValueOf(126);
        Integer t2 = i.getAutoBoxing(126);
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (t1.intValue() == t2.intValue()));

    }
}