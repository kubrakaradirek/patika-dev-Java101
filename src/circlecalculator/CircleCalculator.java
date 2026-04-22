package circlecalculator;

import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        double r, alpha, pi = 3.14, area, perimeter, sectorArea;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius (r): ");
        r = scanner.nextDouble();

        area = pi * r * r;
        perimeter = 2 * pi * r;

        System.out.println("--- Standard Circle ---");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        System.out.print("\nEnter the central angle (alpha): ");
        alpha = scanner.nextDouble();

        sectorArea = (pi * (r * r) * alpha) / 360.0;

        System.out.println("--- Circle Sector ---");
        System.out.println("Area of the sector: " + sectorArea);
    }
}