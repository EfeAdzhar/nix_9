package ua.com.alevel.level2;

import java.util.Stack;
import java.util.Scanner;

public class Brackets {

    public static void isValid(String string) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> charactersStack = new Stack<>();
        System.out.println("Enter String: ");
        string = scanner.nextLine();
        int length = string.length();
        boolean bool = false;
        if (string.isEmpty() | string == null) {
            return;
        }

        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == '{') {
                charactersStack.push('{');
            } else if (string.charAt(i) == '[') {
                charactersStack.push('[');
            } else if (string.charAt(i) == '(') {
                charactersStack.push('(');
            } else if (!charactersStack.isEmpty() && charactersStack.peek() == '{') {
                charactersStack.pop();
            } else if (!charactersStack.isEmpty() && charactersStack.peek() == '[') {
                charactersStack.pop();
            } else if (!charactersStack.isEmpty() && charactersStack.peek() == '(') {
                charactersStack.pop();
            } else {
                break;
            }
        }
        if (charactersStack.isEmpty()) {
        } else {
        }
    }
}