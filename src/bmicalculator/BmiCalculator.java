package bmicalculator;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        double height, weight, bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        height = scanner.nextDouble();

        System.out.print("Please enter your weight: ");
        weight = scanner.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);
    }
}