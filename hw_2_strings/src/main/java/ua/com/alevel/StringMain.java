package ua.com.alevel;

import ua.com.alevel.reversestring.SimpleStringReverse;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) throws InputMismatchException {
        try {
            String inputLine = "";
            int integer = 0;
            System.out.println("1. Simple Reverse.");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 :
                    SimpleStringReverse simpleStringReverse = new SimpleStringReverse();
                    simpleStringReverse.simpleReverse(inputLine);
                    break;
                default:
                    System.out.println("There's no similar options");

            }
        } catch (InputMismatchException | IOException ime) {
            System.out.println("Wrong input or no similar options!");
        }
    }
}
