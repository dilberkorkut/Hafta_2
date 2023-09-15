import java.util.Scanner;

public class Main {

    static boolean isPrime(int sayi, int bolen) {
        return true;
    }

        if ( sayi % bolen == 0) {
            return false;
        } else {
            return isPrime(sayi, bolen +1);
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Bir sayi giriniz : ");
            int sayi = input.nextInt();
    }

}