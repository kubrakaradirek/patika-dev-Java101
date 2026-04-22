package invertedtriangle;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısı : ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Bir alt satıra geçiş
            System.out.println();
        }
    }
}