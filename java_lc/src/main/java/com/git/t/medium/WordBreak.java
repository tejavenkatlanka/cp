package com.git.t.medium;

import java.util.List;
import java.util.Set;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean flag[] = new boolean[s.length() + 1];
        flag[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (String str : wordDict) {
                if (str.length() <= i) {
                    if (flag[i - str.length()]) {
                        if (s.substring(i - str.length(), i).equals(str)) {
                            flag[i] = true;
                            break;

                        }

                    }

                }

            }
        }

        return flag[s.length()];

    }

    public boolean wordBreak(String s, Set<String> dict) {
        boolean flag[] = new boolean[s.length() + 1];
        flag[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (flag[j] && dict.contains(s.substring(j, i))) {
                    flag[i] = true;
                    break;
                }
            }

        }
        return flag[s.length()];
    }
}