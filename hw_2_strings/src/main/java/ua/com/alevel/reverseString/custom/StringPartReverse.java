package ua.com.alevel.reverseString.custom;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.io.IOException;

public class StringPartReverse {
    public static void partReverse(String string, String part) throws IOException, InputMismatchException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String reversedString = "";
        System.out.println("Enter a string:");
        string = bufferedReader.readLine();
        System.out.println("Enter a part:");
        part = bufferedReader.readLine();
        while (true) {
            try {
                for (int i = part.length() - 1; i >= 0; i--) {
                    reversedString += part.charAt(i);
                }
                break;
            } catch (InputMismatchException ime) {
                ime.printStackTrace();
            }
        }
        System.out.println("Reversed part: " + string.replaceAll(part, reversedString));
    }
}

