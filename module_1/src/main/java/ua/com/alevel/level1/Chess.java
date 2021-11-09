package ua.com.alevel.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {

    public static void horseMove() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input horse position 1 : ");
        int horsePositionOne = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input horse position 2 : ");
        int horsePositionTwo = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input cell position 1: ");
        int cellOne = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input cell position 2: ");
        int cellTwo = Integer.parseInt(bufferedReader.readLine());

        int x = Math.abs(horsePositionOne - horsePositionTwo);
        int y = Math.abs(cellOne - cellTwo);

        if (x == 1 && y == 1 || x == 2 && y == 1) {
            System.out.println("Horse can move to this position.");
        } else {
            System.out.println("Horse can`t move to this position.");
        }
    }
}