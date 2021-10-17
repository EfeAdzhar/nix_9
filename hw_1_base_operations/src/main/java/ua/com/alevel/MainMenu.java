package ua.com.alevel;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws InputMismatchException {
        try {
        String inputLine = "";
        int integer = 0;
        System.out.println("Choose an option");
        System.out.println("1. Number Sum.");
        System.out.println("2. Characters Sum.");
        System.out.println("3. Show Lesson End Time.");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    BaseOperations1 baseOperations1 = new BaseOperations1();
                    baseOperations1.outputSum(inputLine);
                    return;
                case 2:
                    BaseOperations2 baseOperations2 = new BaseOperations2();
                    baseOperations2.outputChar(inputLine);
                    return;
                case 3:
                    EndOfALesson endOfALesson = new EndOfALesson();
                    endOfALesson.lessonEndCounter(integer);
                    return;
                default:
                    System.out.println("There's no similar options");
            }
        } catch (InputMismatchException | IOException ime) {
            System.out.println("Wrong input or no similar options!");
        }
    }
}