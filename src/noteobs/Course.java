package noteobs;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;  // Sınav notu
    int vNote; // Sözlü notu
    double vRate; // Sözlü notunun etkisi

    public Course(String name, String code, String prefix, double vRate) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.vRate = vRate;
        this.note = 0;
        this.vNote = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}