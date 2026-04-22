package palindrome;

import java.util.Scanner;

public class PalindromeChecker {

    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;

            reverseNumber = (reverseNumber * 10) + lastNumber;

            temp /= 10;
        }

        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int input = scan.nextInt();

        if (isPalindrome(input)) {
            System.out.println(input + " bir palindrom sayıdır.");
        } else {
            System.out.println(input + " bir palindrom sayı değildir.");
        }
    }
}