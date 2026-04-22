package elementfrequencyfinder;
import java.util.Arrays;

public class Frequency {
    static boolean isFind(int[] arr, int value, int currentIndex) {
        for (int i = 0; i < currentIndex; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < list.length; i++) {
            if (isFind(list, list[i], i)) {
                continue;
            }

            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }

            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}