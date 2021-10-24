package ua.com.alevel;
import ua.com.alevel.reverseString.custom.ReverseByIndex;
import ua.com.alevel.reverseString.custom.SimpleStringReverse;
import ua.com.alevel.reverseString.custom.StringPartReverse;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) throws InputMismatchException {
        System.out.println("1. Simple Reverse.");
        System.out.println("2. Part Reverse.");
        System.out.println("3. Index Reverse.");
        String inputLine = "";
        String inputPart = "";
        int firstIndex = 0;
        int lastIndex = 0;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        try {
            switch (choice) {
                case 1 :
                    SimpleStringReverse simpleStringReverse = new SimpleStringReverse();
                    simpleStringReverse.simpleReverse(inputLine);
                    break;
                case 2 :
                    StringPartReverse stringPartReverse = new StringPartReverse();
                    stringPartReverse.partReverse(inputLine, inputPart);
                case 3 :
                    ReverseByIndex reverseByIndex = new ReverseByIndex();
                    reverseByIndex.reverseByIndexMethod(inputLine, firstIndex, lastIndex);
                default:
                    System.out.println("There's no similar options");
            }
        } catch (InputMismatchException | IOException ime) {
            System.out.println("Wrong input or no similar options!");
        }
    }
}
