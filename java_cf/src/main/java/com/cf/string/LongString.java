package com.cf.string;

public class LongString {

    public  String makeItShort(String string){
        if(string.length()<=10)return  string;
        return  new StringBuilder().append(string.charAt(0))
                .append(string.length()-2).append(string.charAt(string.length()-1)).toString();
    }
}
