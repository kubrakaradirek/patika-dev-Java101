package recursivepattern;
import java.util.Scanner;

public class PatternMethod {

    static void manipulate(int n, int original, boolean isDecreasing) {
        System.out.print(n + " ");

        if (!isDecreasing && n == original) {
            return;
        }

        if (isDecreasing) {
            if (n > 0) {
                manipulate(n - 5, original, true);
            } else {
                manipulate(n + 5, original, false);
            }
        }
        else {
            manipulate(n + 5, original, false);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = scan.nextInt();

        System.out.print("Çıktısı : ");
        manipulate(n, n, true);

        scan.close();
    }
}