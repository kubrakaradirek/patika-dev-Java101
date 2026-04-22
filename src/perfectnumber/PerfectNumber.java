package perfectnumber;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                total += i;
            }
            i++;
        }

        if (total == number && number > 1) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}