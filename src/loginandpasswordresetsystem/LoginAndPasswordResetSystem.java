package loginandpasswordresetsystem;

import java.util.Scanner;

public class LoginAndPasswordResetSystem {
    public static void main(String[] args) {
        String userName, password, select, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");

            // Şifre yanlışsa sıfırlama teklif et
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (evet/hayır): ");
            select = inp.nextLine();

            if (select.equalsIgnoreCase("evet")) {
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newPassword = inp.nextLine();

                // Yeni şifrenin eski (hatalı girilen veya sistemdeki) şifreyle aynı olmaması kontrolü
                if (newPassword.equals("java123") || newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Giriş sonlandırıldı.");
            }
        }
    }
}