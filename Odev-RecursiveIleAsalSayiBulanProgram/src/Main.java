import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();


        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR!");
        } else {
            System.out.println(number + " sayısı ASAL değildir!");
        }
    }

    public static boolean isPrime(int number, int bolen) {
        if ((number <= 1) && (number % bolen == 0)) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        return isPrime(number, bolen - 1);
    }
}




