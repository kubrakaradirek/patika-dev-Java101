package gradeaverage;

import java.util.Scanner;

public class GradeAvg {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int totalGrade = 0;
        int courseCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            totalGrade += mat;
            courseCount++;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            totalGrade += fizik;
            courseCount++;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            totalGrade += turkce;
            courseCount++;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            totalGrade += kimya;
            courseCount++;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            totalGrade += muzik;
            courseCount++;
        }

        if (courseCount > 0) {
            double average = (double) totalGrade / courseCount;

            if (average <= 55) {
                System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            } else {
                System.out.println("Tebrikler, sınıfı geçtiniz!");
            }
            System.out.println("Ortalamanız : " + average);
        } else {
            System.out.println("Hiç geçerli not girilmediği için ortalama hesaplanamadı.");
        }
    }
}