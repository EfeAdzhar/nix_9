package ua.com.alevel.level2;

import java.util.Stack;

public class Brackets {
    public static boolean isValid(String s) {

        Stack<Character> c = new Stack<>();
        int n = s.length();
        boolean bool = false;
        if (s.isEmpty() | s == null) {
            return true;
        }

        for (int i=0 ; i<n ; i++) {
            if (s.charAt(i) == '{') {
                c.push('{');
            } else if (s.charAt(i) == '[') {
                c.push('[');
            } else if (s.charAt(i) == '(') {
                c.push('(');

            } else if (!c.isEmpty() && c.peek() == '{') {
                c.pop();
            } else if (!c.isEmpty() && c.peek() == '[') {
                c.pop();
            } else if (!c.isEmpty() && c.peek() == '(') {
                c.pop();
            } else {
                break;
            }
        }
        if (c.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}