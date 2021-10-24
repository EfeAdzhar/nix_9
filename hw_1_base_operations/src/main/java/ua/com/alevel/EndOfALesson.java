package ua.com.alevel;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EndOfALesson {
    public void lessonEndCounter(int integer) throws IOException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int lessonNumber;
        try {
            System.out.println("Find out when the lesson ends.");
            System.out.println("Print the lesson you need:");
            lessonNumber = scanner.nextInt();
            int a = lessonNumber;
            a = a * 45 + (a / 2) * 5 + ((a + 1) / 2 - 1) * 15;
            int lessonHours = a / 60 + 9;
            int lessonMinutes = a % 60;
            System.out.println("The lesson " + lessonNumber + " ends at " + lessonHours + ":" + lessonMinutes);
        } catch (InputMismatchException ime) {
            System.out.println("Wrong input");
        }
    }
}