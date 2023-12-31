import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        int result = a+b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minus (int a, int b) {
        int result = a-b;
        System.out.println("Cikarma: " + result);
        return result;
    }

    static int times (int a, int b) {
        int result = a*b;
        System.out.println("Carpma: " + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            System.out.println("Ikinci sayi 0'dan farkli olmali");
            return 0;
        }
        int result = a / b;
        System.out.println("Bolum  : " + result);
        return result;
    }

    static int power (int a, int b) {
        int result = 1;
        for(int i=1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a%b;
    }

    static void calc(int a, int b) {
        System.out.println("Cevresi: " + (2*(a+b)));
        System.out.println("Alani: " + (a*b));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-Toplama\n"
                + "2-Cikarma\n"
                + "3-Carpma\n"
                + "4-Bolme\n"
                + "5-Us Alma\n"
                + "6-Mod Alma\n"
                + "7-Dikdortgen Alan ve Cevre Hesabi\n"
                + "8-Cikis Yap";

        System.out.println(menu);

        while(true) {
            System.out.print("Bir islem seciniz: " );
            select = scan.nextInt();

            if(select == 0) {
                break;
            }
            System.out.print("Birinci sayiyi giriniz: ");
            int a = scan.nextInt();
            System.out.print("Ikinci sayiyi giriniz: ");
            int b = scan.nextInt();

            switch(select) {
                case 1 :
                    sum(a,b);
                    break;

                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("Us hesabi: " + power(a,b));
                    break;
                case 6:
                    System.out.println("Mod Islemi " + mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Gecersiz bir islem girdiniz.");

            }

        }


    }
}