package greengrocercheckout;

import java.util.Scanner;

public class GreengrocerCheckout {
    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.00;

        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg, total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many kilos of Pears? : ");
        pearKg = scanner.nextDouble();

        System.out.print("How many kilos of Apples? : ");
        appleKg = scanner.nextDouble();

        System.out.print("How many kilos of Tomatoes? : ");
        tomatoKg = scanner.nextDouble();

        System.out.print("How many kilos of Bananas? : ");
        bananaKg = scanner.nextDouble();

        System.out.print("How many kilos of Eggplants? : ");
        eggplantKg = scanner.nextDouble();

        total = (pearKg * pearPrice) +
                (appleKg * applePrice) +
                (tomatoKg * tomatoPrice) +
                (bananaKg * bananaPrice) +
                (eggplantKg * eggplantPrice);

        System.out.println("Total Amount : " + total + " TL");
    }
}