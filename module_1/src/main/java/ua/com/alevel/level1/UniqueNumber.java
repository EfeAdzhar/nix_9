package ua.com.alevel.level1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniqueNumber {
    public static void uniqueNumber() {
        String string = "";
        int arrSize = 0;
        int arrIteration = 0;

        System.out.println("Enter a string: ");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            string = bufferedReader.readLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        char [] charArr = new char[string.length()];
        string.getChars(0, string.length(), charArr, 0);

        for(int i = 0; i < string.length(); i++) {
            if (Character.isDigit(charArr[i])) arrSize++;
        }
        char [] charNumbersArray = new char[arrSize];
        for(int i = 0; i < string.length(); i++) {
            if (Character.isDigit(charArr[i])) {
               for (int j = 0; j <= arrIteration; j++) {
                   if(charNumbersArray[j] == charArr[i]) {
                       break;
                   } else {
                       if (j == arrIteration) {
                           charNumbersArray[arrIteration] = charArr[i];
                           arrIteration++;
                           break;
                       }
                   }
               }
            }
        }
        System.out.print("Number of unique numbers: " + arrIteration);
        System.out.println();
    }
}