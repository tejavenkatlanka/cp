package com.git.t.easy.string;

public class AddString {
    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int rem = 0;
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;
        for (; n1 >= 0 || n2 >= 0; n1--, n2--) {
            rem+= (n1<0? '0': num1.charAt(n1)) - '0' + (n2 <0? '0': num2.charAt(n2)) - '0';
            builder.insert(0, rem % 10);
            rem = rem / 10;

        }
        if (rem != 0) {
            builder.insert(0, rem);

        }
        return builder.toString();
    }
}
