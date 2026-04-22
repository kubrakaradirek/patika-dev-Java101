package trianglecalculator;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        double a, b, c, u, perimeter, area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Hypotenuse Calculator ---");
        System.out.print("Enter first side (a): ");
        a = scanner.nextDouble();
        System.out.print("Enter second side (b): ");
        b = scanner.nextDouble();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("Hypotenuse: " + c);

        System.out.println("\n--- Area Calculator for Any Triangle ---");
        System.out.print("Enter third side (c): ");
        c = scanner.nextDouble(); // Re-using or taking c for a general triangle

        u = (a + b + c) / 2.0;
        perimeter = 2 * u;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Perimeter of the triangle: " + perimeter);
        System.out.println("Area of the triangle: " + area);
    }
}