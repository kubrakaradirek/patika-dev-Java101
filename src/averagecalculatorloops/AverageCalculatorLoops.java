package averagecalculatorloops;

import java.util.Scanner;

public class AverageCalculatorLoops {
    public static void main(String[] args) {
        int k, count = 0, sum = 0;
        double average;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        k = inp.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i != 0 && i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
                System.out.println("Bölünen sayı: " + i);
            }
        }

        if (count > 0) {
            average = (double) sum / count;
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
        } else {
            System.out.println("Girdiğiniz aralıkta 3 ve 4'e tam bölünen bir sayı bulunamadı.");
        }
    }
}
