package com.java101.powercalculator;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        int n, k;
        long total = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı (Taban) : ");
        n = scan.nextInt();

        System.out.print("Üs olacak sayı : ");
        k = scan.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }

        System.out.println("Sonuç : " + total);
    }
}