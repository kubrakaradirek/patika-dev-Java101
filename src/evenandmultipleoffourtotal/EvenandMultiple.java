package evenandmultipleoffourtotal;

import java.util.Scanner;

public class EvenandMultiple {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            n = scan.nextInt();

            if (n % 2 == 0 && n % 4 == 0) {
                total += n;
            }

        } while (n % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}