package com.submit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number =Integer.valueOf(scanner.nextLine());
        for(int i=0;i<number;i++)
            System.out.println(makeItShort(scanner.nextLine()));
    }

    public static String makeItShort(String string){
        if(string.length()<=10)return  string;
        return  new StringBuilder().append(string.charAt(0))
                .append(string.length()-2).append(string.charAt(string.length()-1)).toString();
    }
}
