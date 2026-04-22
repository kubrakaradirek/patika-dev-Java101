package digitssum;

import java.util.Scanner;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, tempNumber, basValue, total = 0;

        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;

            total += basValue;

            tempNumber /= 10;
        }

        System.out.println(number + " sayısının basamakları toplamı : " + total);
    }
}