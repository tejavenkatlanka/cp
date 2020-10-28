package com.github.general.boxing;

import org.junit.jupiter.api.Test;

class StrTest {

    @Test
    void getAutoBoxing() {
        Str i = new Str();

        String nu1 = i.getAutoBoxing("12312");
        String nu2 = i.getAutoBoxing("12312");
        System.out.println("value " + (nu1 == nu2));
        System.out.println("primitive value " + (Integer.valueOf(nu1) == Integer.valueOf(nu2)));
        System.out.println("primitive value " + (Integer.parseInt(nu1) == Integer.parseInt(nu2)));

        String t1 = i.getAutoBoxing("1.0");
        String t2 = i.getAutoBoxing("1.0");
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (Double.valueOf(t1) == Double.valueOf(t2)));
        System.out.println("primitive value " + (Double.parseDouble(t1) == Double.parseDouble(t2)));


    }

    @Test
    void get() {
        Str i = new Str();

        String nu1 = i.getByValueOf("12312");
        String nu2 = i.getByValueOf("12312");
        System.out.println("value " + (nu1 == nu2));
        System.out.println("primitive value " + (Integer.valueOf(nu1) == Integer.valueOf(nu2)));
        System.out.println("primitive value " + (Integer.parseInt(nu1) == Integer.parseInt(nu2)));

        String t1 = i.getByValueOf("1.0");
        String t2 = i.getByValueOf("1.0");
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (Double.valueOf(t1) == Double.valueOf(t2)));
        System.out.println("primitive value " + (Double.parseDouble(t1) == Double.parseDouble(t2)));
    }

    @Test
    void testing() {
        Str i = new Str();
        String nu1 = i.getByValueOf("12312");
        String nu2 = i.getAutoBoxing("12312");
        System.out.println("value " + (nu1 == nu2));
        System.out.println("primitive value " + (Integer.valueOf(nu1) == Integer.valueOf(nu2)));
        System.out.println("primitive value " + (Integer.parseInt(nu1) == Integer.parseInt(nu2)));

        String t1 = i.getByValueOf("1.0");
        String t2 = i.getAutoBoxing("1.0");
        System.out.println("value " + (t1 == t2));
        System.out.println("primitive value " + (Double.valueOf(t1) == Double.valueOf(t2)));
        System.out.println("primitive value " + (Double.parseDouble(t1) == Double.parseDouble(t2)));

    }
}