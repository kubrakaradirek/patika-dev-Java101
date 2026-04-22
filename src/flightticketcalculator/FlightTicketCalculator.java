package flightticketcalculator;

import java.util.Scanner;

public class FlightTicketCalculator {
    public static void main(String[] args) {
        int km, age, type;
        double pricePerKm = 0.10, total, ageDiscount, typeDiscount;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = input.nextInt();

        if (km > 0 && age > 0 && (type == 1 || type == 2)) {

            total = km * pricePerKm;

            if (age < 12) {
                ageDiscount = total * 0.50;
            } else if (age >= 12 && age <= 24) {
                ageDiscount = total * 0.10;
            } else if (age >= 65) {
                ageDiscount = total * 0.30;
            } else {
                ageDiscount = 0;
            }
            total -= ageDiscount;

            if (type == 2) {
                typeDiscount = total * 0.20;
                total = (total - typeDiscount) * 2;
            }

            System.out.println("Toplam Tutar = " + total + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
