package com.git.t.easy;

public class ToHex {
    public String toHex(int num) {
        StringBuilder builder = new StringBuilder();
        if (num == 0) builder.append(num
        );
        char[] map = "0123456789abcdef".toCharArray();
        while (num != 0) {
            builder.append(map[num & 15] + "");
            num = num >>> 4;
        }
        return builder.reverse().toString();
    }
}
