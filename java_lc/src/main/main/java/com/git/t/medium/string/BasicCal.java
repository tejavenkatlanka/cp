package com.git.t.medium.string;

import java.util.Stack;

public class BasicCal {

  public int calculate(String s) {
    int current = 0, last = 0, res = 0;
    char operation = '+';

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isDigit(ch)) {
        current = (current * 10) + ch - '0';
      }
      if (!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == s.length() - 1) {
        if (operation == '-' || operation == '+') {
          res += last;
          last = (operation == '+') ? current : -current;
        } else if (operation == '*') {
          last *= current;
        } else if (operation == '/') {
          last /= current;
        }
        operation = ch;
        current = 0;

      }
    }
    return res;
  }

  public int calculate0(String s) {
    Stack<Integer> stack = new Stack<>();
    int current = 0;
    char operation = '+';

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isDigit(ch)) {
        current = (current * 10) + ch - '0';
      }
      if (!Character.isDigit(ch) && !Character.isWhitespace(ch) || i == s.length() - 1) {
        if (operation == '-') {
          stack.push(-current);
        } else if (operation == '+') {
          stack.push(current);
        } else if (operation == '*') {
          stack.push(stack.pop() * current);
        } else if (operation == '/') {
          stack.push(stack.pop() / current);
        }
        operation = ch;
        current = 0;
      }
    }
    int result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop();
    }
    return result;

  }
}
