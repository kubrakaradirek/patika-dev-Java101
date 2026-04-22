package weatheractivitypredictor;

import java.util.Scanner;

public class WeatherActivityPredictor {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if (heat < 5) System.out.println("Kayak yapabilirsiniz.");
        if (heat >= 5 && heat <= 15) System.out.println("Sinemaya gidebilirsiniz.");
        if (heat > 15 && heat <= 25) System.out.println("Pikniğe gidebilirsiniz.");
        if (heat > 25) System.out.println("Yüzmeye gidebilirsiniz.");

    }
}