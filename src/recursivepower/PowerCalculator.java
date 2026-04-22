package recursivepower;
import java.util.Scanner;

public class PowerCalculator {

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz :");
            int base = scan.nextInt();

            System.out.print("Üs değerini giriniz :");
            int exp = scan.nextInt();

            System.out.println("Sonuç : " + power(base, exp));

            System.out.println("--------------------");
        }
    }
}