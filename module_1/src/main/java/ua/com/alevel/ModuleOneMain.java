package ua.com.alevel;

import ua.com.alevel.level1.UniqueNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModuleOneMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String menu;
        do {
            System.out.println("1. Level 1.");
            System.out.println("2. Level 2.");
            System.out.println("3. Level 3.");
            System.out.println("4. Exit");
            menu = bufferedReader.readLine();
            switch (menu) {
                case "1":
                    levelOne();
                    menu = "";
                    break;

            }
        } while (!menu.equals("4"));
    }

    public static void levelOne() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String menu;
        do {
            System.out.println("1. Unique Number in Array.");
            System.out.println("2. Chess.");
            System.out.println("3. Triangle area.");
            System.out.println("4. Go to main menu.");
            menu = reader.readLine();
            switch (menu) {
                case "1": {
                    UniqueNumber.uniqueNumber();
                    menu = "";
                    break;
                }
            }
        } while (!menu.equals("4"));
    }
}
