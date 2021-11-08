package ua.com.alevel;

import ua.com.alevel.level1.AreaOfTriangle;
import ua.com.alevel.level1.Chess;
import ua.com.alevel.level1.UniqueNumber;
import ua.com.alevel.level2.BinaryTree;
import ua.com.alevel.level2.Brackets;
import ua.com.alevel.level3.GameOfLife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModuleOneMain {
    public static void main(String[] args) throws IOException, InterruptedException {
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
                case "2":
                    levelTwo();
                    menu = "";
                    break;
                case "3":
                    levelThree();
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
                case "2": {
                    Chess.horseMove();
                    menu = "";
                    break;
                }
                case "3": {
                    AreaOfTriangle.findTriangleAreaByThreePoints();
                    menu = "";
                    break;
                }
            }
        } while (!menu.equals("4"));
    }

    public static void levelTwo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String menu;
        do {
            System.out.println("1. Brackets.");
            System.out.println("2. Binary tree.");
            System.out.println("3. Go to main menu.");
            menu = reader.readLine();
            switch (menu) {
                case "1": {
                    Brackets.isValid(menu);
                    menu = "";
                    break;
                }
                case "2": {
                    BinaryTree.run();
                    menu = "";
                    break;
                }
            }
        } while (!menu.equals("3"));
    }

    public static void levelThree() throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String menu;

        do {
            System.out.println("1. GameOfLife.");
            System.out.println("2. Go to main menu.");
            menu = reader.readLine();
            switch (menu) {
                case "1": {
                     GameOfLife.run();
                    menu = "";
                    break;
                }
            }
        } while (!menu.equals("2"));
    }
}
