package com.git.t.easy.string;

public class DetectCapital {
    public DetectCapital() {
    }

    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) {
            return true;
        } else if (!Character.isUpperCase(word.charAt(0))) {
            return this.isLowerCase(word);
        } else {
            return this.isLowerCase(word.substring(1)) || this.isUpperCase(word.substring(2));
        }
    }

    private boolean isUpperCase(String word) {
        char[] cha = word.toCharArray();

        for(int i = 0; i < cha.length; ++i) {
            if (Character.isLowerCase(cha[i])) {
                return false;
            }
        }

        return true;
    }

    private boolean isLowerCase(String word) {
        char[] cha = word.toCharArray();

        for(int i = 0; i < cha.length; ++i) {
            if (Character.isUpperCase(cha[i])) {
                return false;
            }
        }

        return true;
    }
}
