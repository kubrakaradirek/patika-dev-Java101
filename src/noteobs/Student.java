package noteobs;

public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matV, int fizik, int fizikV, int kimya, int kimyaV) {
        if (mat >= 0 && mat <= 100) this.mat.note = mat;
        if (matV >= 0 && matV <= 100) this.mat.vNote = matV;

        if (fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if (fizikV >= 0 && fizikV <= 100) this.fizik.vNote = fizikV;

        if (kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
        if (kimyaV >= 0 && kimyaV <= 100) this.kimya.vNote = kimyaV;
    }

    public void isPass() {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Ortalama : " + String.format("%.2f", this.avarage));
        if (this.isPass) {
            System.out.println("Sınıfı Geçti.");
        } else {
            System.out.println("Sınıfta Kaldı.");
        }
    }

    public void calcAvarage() {
        double matAvg = (this.mat.vNote * this.mat.vRate) + (this.mat.note * (1 - this.mat.vRate));
        double fizikAvg = (this.fizik.vNote * this.fizik.vRate) + (this.fizik.note * (1 - this.fizik.vRate));
        double kimyaAvg = (this.kimya.vNote * this.kimya.vRate) + (this.kimya.note * (1 - this.kimya.vRate));

        this.avarage = (matAvg + fizikAvg + kimyaAvg) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu (Sınav/Sözlü) : " + this.mat.note + " / " + this.mat.vNote);
        System.out.println("Fizik Notu (Sınav/Sözlü)     : " + this.fizik.note + " / " + this.fizik.vNote);
        System.out.println("Kimya Notu (Sınav/Sözlü)     : " + this.kimya.note + " / " + this.kimya.vNote);
    }
}