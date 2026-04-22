package noteobs;

public class Test {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT", 0.20);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.30);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.40);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90551", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90552", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "1401", mat, fizik, kimya);
        s1.addBulkExamNote(50, 90, 40, 80, 40, 70);
        s1.isPass();
    }
}