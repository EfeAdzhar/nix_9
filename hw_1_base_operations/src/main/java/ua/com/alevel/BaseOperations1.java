package ua.com.alevel;
import java.util.Scanner;

public class BaseOperations1 {
    public void outputSum(String line) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
        "A program that takes a string\n" +
        "and extracts all the numbers\n" +
        "and finds their sum.\n");
        System.out.println("Enter your string:");
        line = scanner.nextLine();
        System.out.println("Your output: " + findSum(line));
    }
    public static int findSum(String str) {
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (Character.isDigit(character)) {
                temp += character;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }
}