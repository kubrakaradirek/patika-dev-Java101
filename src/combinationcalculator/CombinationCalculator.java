package combinationcalculator;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r;

        System.out.print("Kümenin eleman sayısı (n): ");
        n = scan.nextInt();

        System.out.print("Gruplanacak eleman sayısı (r): ");
        r = scan.nextInt();

        if (n < r) {
            System.out.println("n değeri r değerinden küçük olamaz!");
        } else {
            long nFact = factorial(n);
            long rFact = factorial(r);
            long nMinusRFact = factorial(n - r);

            long result = nFact / (rFact * nMinusRFact);
            System.out.println("C(" + n + "," + r + ") kombinasyonu: " + result);
        }
    }

    public static long factorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}