package gradeaveragecalculator;

import java.util.Scanner;

public class GradeAverageCalculatorTestMain {
        public static void main(String[] args) {
            // Define variables
            int math, physics, chemistry, turkish, history, music;

            // Create Scanner object
            Scanner scanner = new Scanner(System.in);

            // Get values from the user
            System.out.print("Math grade: ");
            math = scanner.nextInt();

            System.out.print("Physics grade: ");
            physics = scanner.nextInt();

            System.out.print("Chemistry grade: ");
            chemistry = scanner.nextInt();

            System.out.print("Turkish grade: ");
            turkish = scanner.nextInt();

            System.out.print("History grade: ");
            history = scanner.nextInt();

            System.out.print("Music grade: ");
            music = scanner.nextInt();

            // Calculate average
            int total = (math + physics + chemistry + turkish + history + music);
            double average = total / 6.0;

            System.out.println("Your average: " + average);

            String status = (average > 60) ? "Passed the Class" : "Failed the Class";

            System.out.println(status);
        }

}