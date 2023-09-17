import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH","555");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "000");
        Teacher t3 = new Teacher("Kulyutmaz", "Biyo", "111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Kulyutmaz", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Inek Saban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student ("Guduk Necmi", "132","5", tarih, fizik, biyo);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();

    }
}