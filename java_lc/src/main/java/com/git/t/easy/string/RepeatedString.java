package com.git.t.easy;

public class RepeatedString {

    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        return  (str).substring(1,str.length()-1).contains(s);
    }

    public boolean repeatedSubstringPatternc(String s) {
        for (int i = s.length() / 2; i >= 1; i--) {
            if (s.length() % i == 0) {
                int count = s.length() / i;
                String sub = s.substring(0, i);
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < count; j++) {
                    builder.append(sub);
                }
                if (builder.toString().equals(s)) {
                    return true;
                }
            }
        }
        return  false;
    }


}
