package com.git.t.medium.string;

public class ReverseWord {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if(words[i].isBlank()) continue;
            builder.append(words[i]);
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length()-1);

        return builder.toString();

    }
}
