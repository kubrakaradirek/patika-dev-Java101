package minesweepergame;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size;
    String[][] mineMap;
    String[][] gameBoard;
    boolean isGameInProgress = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineMap = new String[rowNumber][colNumber];
        this.gameBoard = new String[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void run() {
        prepareGame();

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        int totalMovesNeeded = size - (size / 4); // Kazanmak için gereken hamle sayısı
        int currentMoves = 0;

        while (isGameInProgress) {
            printMap(gameBoard);
            System.out.print("Satır Giriniz : ");
            int row = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            int col = scan.nextInt();

            // Sınır kontrolü
            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {
                System.out.println("Geçersiz koordinat! Lütfen sınırları dahilinde giriş yapın.");
                continue;
            }

            // Daha önce seçilme kontrolü
            if (!gameBoard[row][col].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            // Mayın kontrolü
            if (mineMap[row][col].equals("*")) {
                isGameInProgress = false;
                System.out.println("Game Over!!");
                System.out.println("===========================");
            } else {
                int count = countMinesNearby(row, col);
                gameBoard[row][col] = String.valueOf(count);
                currentMoves++;

                if (currentMoves == totalMovesNeeded) {
                    System.out.println("Tebrikler! Oyunu Kazandınız !");
                    printMap(gameBoard);
                    break;
                }
            }
        }
    }

    // Matrisleri başlangıç değerleriyle doldurur ve mayınları yerleştirir
    public void prepareGame() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mineMap[i][j] = "-";
                gameBoard[i][j] = "-";
            }
        }

        int mineCount = size / 4;
        while (mineCount > 0) {
            int rRow = rand.nextInt(rowNumber);
            int rCol = rand.nextInt(colNumber);

            if (!mineMap[rRow][rCol].equals("*")) {
                mineMap[rRow][rCol] = "*";
                mineCount--;
            }
        }
    }

    // Seçilen noktanın etrafındaki mayınları sayar
    public int countMinesNearby(int r, int c) {
        int count = 0;
        for (int i = (r - 1); i <= (r + 1); i++) {
            for (int j = (c - 1); j <= (c + 1); j++) {
                if (i < 0 || j < 0 || i >= rowNumber || j >= colNumber) {
                    continue;
                }
                if (mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }
        return count;
    }

    // Matrisi ekrana basar
    public void printMap(String[][] arr) {
        for (String[] row : arr) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("===========================");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;

        while (true) {
            System.out.print("Satır Sayısı Giriniz (Min 2): ");
            row = scan.nextInt();
            System.out.print("Sütun Sayısı Giriniz (Min 2): ");
            col = scan.nextInt();

            if (row >= 2 && col >= 2) {
                break;
            } else {
                System.out.println("Hata: Matris boyutu en az 2x2 olmalıdır!");
            }
        }

        MineSweeper game = new MineSweeper(row, col);
        game.run();
    }
}