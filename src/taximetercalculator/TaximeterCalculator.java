package taximetercalculator;

import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        double km, perKm = 2.20, total, startPrice = 10.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in KM: ");
        km = scanner.nextDouble();

        total = startPrice + (km * perKm);

        total = (total < 20) ? 20 : total;

        System.out.println("Total Amount: " + total + " TL");
    }
}