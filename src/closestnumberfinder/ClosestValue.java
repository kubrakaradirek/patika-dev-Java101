package closestnumberfinder;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestValue {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int input = scanner.nextInt();
        Arrays.sort(list);

        int smallerClosest = list[0];
        int largerClosest = list[list.length - 1];

        for (int i : list) {
            if (i < input) {
                smallerClosest = i;
            }
            if (i > input) {
                largerClosest = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + smallerClosest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + largerClosest);

        scanner.close();
    }
}