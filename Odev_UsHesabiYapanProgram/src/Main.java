import java.util.Scanner;

public class Main {

    static int power(int base, int exponent) {
        if (exponent == 0 || base == 1) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        int base = input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int exponent = input.nextInt();

        int result = power(base, exponent);
        System.out.println("Sonuc: " +result);
    }
}