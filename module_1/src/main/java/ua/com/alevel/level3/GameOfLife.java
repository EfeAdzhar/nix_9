package ua.com.alevel.level3;

import java.util.Scanner;

public class GameOfLife {

    public final static int boardHeight = 20;
    public static Cell[][] board = new Cell[boardHeight][boardHeight];
    public static Cell[][] lastIteration = new Cell[boardHeight][boardHeight];
    public static final int timeBetweenIterations = 250;
    public static final char deadSell = '0';
    public static final char aliveSell = '1';

    private enum Cell {
        DEAD, ALIVE
    }

    public static void printBoard(Cell[][] board) {
        for (int i = 0; i < boardHeight; i++) {
            for (int j = 0; j < boardHeight; j++) {
                switch (board[i][j]) {
                    case DEAD:
                        System.out.print(deadSell);
                        break;
                    case ALIVE:
                        System.out.print(aliveSell);
                        break;
                }
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
    }

    public static Cell changeCell(int x, int y, Cell[][] boardArg) {
        int liveNeighbours = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (x + i >= 0 && y + j >= 0 && x + i < boardHeight && y + j < boardHeight) {
                    if (boardArg[x + i][y + j] == Cell.ALIVE && !(i == 0 && j == 0)) {
                        liveNeighbours++;
                    }
                }
            }
        }

        if (liveNeighbours < 2 && boardArg[x][y] == Cell.ALIVE)
            return Cell.DEAD;
        else if ((liveNeighbours == 2 || liveNeighbours == 3) && boardArg[x][y] == Cell.ALIVE)
            return Cell.ALIVE;
        else if (liveNeighbours > 3 && boardArg[x][y] == Cell.ALIVE)
            return Cell.DEAD;
        else if (boardArg[x][y] == Cell.DEAD && liveNeighbours == 3)
            return Cell.ALIVE;
        else
            return Cell.DEAD;
    }

    public static void run() throws InterruptedException {

        for (int i = 0; i < boardHeight; i++) {
            for (int j = 0; j < boardHeight; j++) {
                board[i][j] = Cell.DEAD;
            }
        }

        Scanner reader = new Scanner(System.in);
        System.out.println("Input number of live cell");
        int numberOfLiveCells = reader.nextInt();

        for (int i = 0; i < numberOfLiveCells; i++) {
            int x = reader.nextInt();
            int y = reader.nextInt();
            board[x][y] = Cell.ALIVE;
        }

        reader.close();
        printBoard(board);

        while (true) {
            for (int i = 0; i < boardHeight; i++) {
                for (int j = 0; j < boardHeight; j++) {
                    lastIteration[i][j] = board[i][j];
                }
            }

            for (int i = 0; i < boardHeight; i++) {
                for (int j = 0; j < boardHeight; j++) {
                    board[i][j] = changeCell(i, j, lastIteration);
                }
            }
            printBoard(board);
            Thread.sleep(timeBetweenIterations);
        }
    }
}