package ua.com.alevel;
import ua.com.alevel.reverseString.custom.SimpleStringReverse;
import ua.com.alevel.reverseString.custom.StringPartReverse;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) throws InputMismatchException {
        try {
            String inputLine = "";
            String inputPart = "";
            int integer = 0;
            System.out.println("1. Simple Reverse.");
            System.out.println("2. Part Reverse.");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    SimpleStringReverse simpleStringReverse = new SimpleStringReverse();
                    simpleStringReverse.simpleReverse(inputLine);
                    break;
                case 2 :
                    StringPartReverse stringPartReverse = new StringPartReverse();
                    StringPartReverse.partReverse(inputLine, inputPart);


                default:
                    System.out.println("There's no similar options");


            }
        } catch (InputMismatchException | IOException ime) {
            System.out.println("Wrong input or no similar options!");
        }
    }
}
