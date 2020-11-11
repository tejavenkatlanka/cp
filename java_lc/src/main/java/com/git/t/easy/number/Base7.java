package com.git.t.easy;

public class Base7 {
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        int tem = num;
        if (num < 0) {
            num = -num;
        }
        StringBuilder builder = new StringBuilder();

        while (num != 0) {
            builder.append(num % 7);
            num = num / 7;
        }
        if (tem < 0) {
            builder.append("-");
        }
        return builder.reverse().toString();
    }

}
