package palindromicwordchecker;

import java.util.Scanner;

public class PalindromeChecker {
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("'" + word + "' bir palindromik kelimedir.");
        } else {
            System.out.println("'" + word + "' bir palindromik kelime değildir.");
        }

        scanner.close();
    }
}