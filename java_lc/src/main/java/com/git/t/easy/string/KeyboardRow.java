package com.git.t.easy;

import java.util.*;

public class KeyboardRow {
    static Map<Character, Integer> keyboardMap = new HashMap<>();

    static {
        loadKeyboardData();
    }

    private static void loadKeyboardData() {

        insertIntoMap("qwertyuiop", 0);
        insertIntoMap("asdfghjkl", 1);
        insertIntoMap("zxcvbnm", 2);
    }

    private static void insertIntoMap(String qwertyuiop, Integer i) {
        for (char c :
                qwertyuiop.toCharArray()) {
            keyboardMap.put(c, i);
        }
    }


    public String[] findWords(String[] words) {
        return
                Arrays.stream(words).filter(w -> w.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
                        .toArray(String[]::new);
    }

    public String[] findWords1(String[] words) {
        List<Integer> response = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isSingleLine(words[i]))
                response.add(i);
        }
        String[] ans = new String[response.size()];
        for (int i = 0; i < response.size(); i++) {
            ans[i] = words[response.get(i)];
        }
        return ans;
    }

    private boolean isSingleLine(String word) {
        int count[] = new int[]{0, 0, 0};
        for (char c : word.toCharArray()) {
            count[keyboardMap.get(Character.toLowerCase(c))]++;
            if ((count[0] != 0 && count[1] != 0) || (count[0] != 0 && count[2] != 0) || (count[1] != 0 && count[2] != 0))
                return false;
        }
        return true;
    }

}
