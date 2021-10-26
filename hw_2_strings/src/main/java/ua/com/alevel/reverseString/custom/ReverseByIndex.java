package ua.com.alevel.reverseString.custom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;

public class ReverseByIndex {

    public void reverseByIndexMethod(String string, int firstIndex, int lastIndex) throws IOException, InputMismatchException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        String reverseString = "";
        System.out.println("Enter a string:");
        string = bufferedReader.readLine();
        System.out.println("Enter a first index:");
        firstIndex = scanner.nextInt();
        System.out.println("Enter the second index:");
        lastIndex = scanner.nextInt();
        String subString;
        subString = string.substring(firstIndex, lastIndex);
        while (true) {
            try {
                for (int i = subString.length() - 1; i >= 0; i--) {
                    reverseString += subString.charAt(i);
                }
                break;
            } catch (InputMismatchException ime) {
                ime.printStackTrace();
            }
        }
        System.out.println(string.replaceAll(subString, reverseString));
    }
}
