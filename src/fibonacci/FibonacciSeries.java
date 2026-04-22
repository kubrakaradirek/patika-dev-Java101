package fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int a = 0, b = 1;

        System.out.print(n + " Elemanlı Fibonacci Serisi : ");

        int i = 1;
        while (i <= n) {
            System.out.print(a + " ");

            int nextNumber = a + b;

            a = b;
            b = nextNumber;

            i++;
        }
    }
}