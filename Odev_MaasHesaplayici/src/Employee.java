public class Employee {
    String name; //Çalışanın adı ve soyadı
    double salary;  //Çalışanın maaşı
    int workHours; //Haftalık çalışma saati
    int hireYear; //İşe başlangıç yılı


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    double bonus(){
        if(workHours>40) {
            return (workHours-40)*30;
        } else {
            return 0;
        }
    }

    double raiseSalary(){
        int workYears = 2021 - hireYear;
        if (workYears < 10){
            return salary*0.05;
        } else if (workYears > 9 && workYears < 20) {
            return salary * 0.10;
        } else { // 19 yildan fazla
            return salary*0.15;
        }
    }

    void toString(Employee employee) {
        System.out.println("Adi: " + name);
        System.out.println("Maasi: " + salary);
        System.out.println("Calisma Saati " + workHours);
        System.out.println("Baslangic Yili: " + hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Artisi: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas: " + (salary + bonus() -tax()));
        System.out.println("Toplam Maas: " + (salary + raiseSalary()+bonus()-tax()));

    }

}
