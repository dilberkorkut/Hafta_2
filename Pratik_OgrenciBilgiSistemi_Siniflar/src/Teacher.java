public class Teacher {
    // Sinifa ait nitelikler tanimlaniyor.
    String name;
    String mpno;
    String branch;

    // Constructor metodunu tanimliyoruz. Sinif ile ayni ismi tasir.
    // Basina void vs bir veri tipi almaz.

    Teacher (String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adi: " + this.name);
        System.out.println("Telefonu: " + this.mpno);
        System.out.println("Bolumu: " + branch);
    }
}
