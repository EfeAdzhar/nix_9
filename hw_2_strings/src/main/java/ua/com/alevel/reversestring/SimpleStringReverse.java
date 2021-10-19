package ua.com.alevel.reversestring;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.io.IOException;

public class SimpleStringReverse {
    public void simpleReverse(String string) throws IOException, InputMismatchException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer reversedString = new StringBuffer();
        System.out.println("Enter a string or a word:");
        string = bufferedReader.readLine();
        while (true) {
            try {
                for (int i = string.length() - 1; i >= 0; i--) {
                   reversedString.append(string.charAt(i));
                }
                break;
            } catch (InputMismatchException ime) {
                ime.printStackTrace();
            }
        }
        System.out.println("Reversed String: " + reversedString);
    }
}
