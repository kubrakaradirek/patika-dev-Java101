package recursivefibonacci;

import java.util.Scanner;

public class RecursiveFibonacci {

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kaçıncı elemanını görmek istiyorsunuz? : ");
        int n = scan.nextInt();

        System.out.println(n + ". Fibonacci Sayısı : " + fib(n));
    }
}