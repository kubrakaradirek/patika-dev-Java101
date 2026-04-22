package minmax;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, number;
        int min = 0, max = 0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = scan.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = scan.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            } else {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            i++;
        }

        if (n > 0) {
            System.out.println("En büyük sayı: " + max);
            System.out.println("En küçük sayı: " + min);
        } else {
            System.out.println("Geçersiz bir sayı adedi girdiniz.");
        }
    }
}