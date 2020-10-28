package com.github.general.boxing;

import org.junit.jupiter.api.Test;

class DouTest {

    @Test
    void getAutoBoxing() {
        Dou i = new Dou();

        Double nu1 = i.getAutoBoxing(128.12);
        Double nu2 = i.getAutoBoxing(128.12);
        System.out.println("value " + (nu1 == nu2));
        System.out.println("primitive value " + (nu1.doubleValue() == nu2.doubleValue()));

        Double t1 = i.getAutoBoxing(1.0);
        Double t2 = i.getAutoBoxing(1.0);
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (t1.doubleValue() == t2.doubleValue()));

    }

    @Test
    void getByValueOf() {
        Dou i = new Dou();

        Double nu1 = i.getByValueOf(128.12);
        Double nu2 = i.getByValueOf(128.12);
        System.out.println("value " + (nu1 == nu2));
        System.out.println("primitive value " + (nu1.doubleValue() == nu2.doubleValue()));

        Double t1 = i.getByValueOf(1.0);
        Double t2 = i.getByValueOf(1.0);
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (t1.doubleValue() == t2.doubleValue()));
    }

    @Test
    void testing() {
        Dou i = new Dou();
        Double nu1 = i.getByValueOf(128.12);
        Double nu2 = i.getAutoBoxing(128.12);
        System.out.println("value " + (nu1 == nu2));
        System.out.println("primitive value " + (nu1.doubleValue() == nu2.doubleValue()));

        Double t1 = i.getByValueOf(1.0);
        Double t2 = i.getAutoBoxing(1.0);
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (t1.doubleValue() == t2.doubleValue()));

    }
}