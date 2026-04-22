package horoscopefinder;

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay (1-12): ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        // Ay ve gün sınırlarının genel kontrolü
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            isError = true;
        } else {
            if (month == 1) {
                burc = (day < 22) ? "Oğlak" : "Kova";
            } else if (month == 2) {
                if (day > 29) isError = true; // Şubat kontrolü
                else burc = (day < 20) ? "Kova" : "Balık";
            } else if (month == 3) {
                burc = (day < 21) ? "Balık" : "Koç";
            } else if (month == 4) {
                if (day > 30) isError = true;
                else burc = (day < 21) ? "Koç" : "Boğa";
            } else if (month == 5) {
                burc = (day < 22) ? "Boğa" : "İkizler";
            } else if (month == 6) {
                if (day > 30) isError = true;
                else burc = (day < 23) ? "İkizler" : "Yengeç";
            } else if (month == 7) {
                burc = (day < 23) ? "Yengeç" : "Aslan";
            } else if (month == 8) {
                burc = (day < 23) ? "Aslan" : "Başak";
            } else if (month == 9) {
                if (day > 30) isError = true;
                else burc = (day < 23) ? "Başak" : "Terazi";
            } else if (month == 10) {
                burc = (day < 23) ? "Terazi" : "Akrep";
            } else if (month == 11) {
                if (day > 30) isError = true;
                else burc = (day < 22) ? "Akrep" : "Yay";
            } else if (month == 12) {
                burc = (day < 22) ? "Yay" : "Oğlak";
            }
        }

        if (isError) {
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
        } else {
            System.out.println("Merhaba, burcunuz : " + burc);
        }
    }
}