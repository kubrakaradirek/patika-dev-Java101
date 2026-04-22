package vatcalculator;

import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        double amount, vatRate, vatAmount, totalWithVat;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        amount = scanner.nextDouble();

        vatRate = (amount > 0 && amount <= 1000) ? 0.18 : 0.08;

        // Calculations
        vatAmount = amount * vatRate;
        totalWithVat = amount + vatAmount;

        // Output results
        System.out.println("Price without VAT: " + amount);
        System.out.println("VAT Rate: " + (vatRate * 100) + "%");
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Price with VAT: " + totalWithVat);
    }
}