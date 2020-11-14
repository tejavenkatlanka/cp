package com.git.t.medium.string;

import java.util.Set;
import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Set<String> AOP= Set.of("+","-","/","*");
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!(token.length()==1&&AOP.contains(token))) {
                stack.push(Integer.valueOf(token));
            } else {
                Integer b = stack.pop();
                Integer a = stack.pop();
                int n = map(a, b, token);
                    stack.push(n);
            }
        }
        return stack.pop();
    }


    private int map(Integer a, Integer b, String s) {
        switch (s) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }

}
