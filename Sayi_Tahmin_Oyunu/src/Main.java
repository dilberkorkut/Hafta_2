import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //0 ile 100 arasında rastgele bir sayı seçin.
        // Bu sayı, kullanıcının tahmin etmeye çalışacağı gizli sayı olacaktır.

        Random rand  = new Random();
        int randNumber = rand.nextInt(100);
        // int randNumber = (int) (Math.random() * 100);
        System.out.println("Rastgele secilmis sayi: " + randNumber);

        Scanner input = new Scanner(System.in);
        int guess; // kullanicinin tahminleri bu degiskene atanir.

        int right = 0; // dogru tahmin sayisi haklari tutar baslangicta sifir olarak ayarlanir.
        int[]wrong = new int[5]; //hatali girisleri saklamak icin kullanacagiz.
        boolean isWin = false; // boolean veriler oyunun sonucunu ve hatali girisleri kontrol etsin.baslangicta her ikisi de false olarak ayarlanir.
        boolean isWrong = false; // false olarak baslar/cunku oyun basladiginda henuz ne kazanan ne de yanlis tahmin var.

        while (right < 5) {
            System.out.print("Lutfen bir tahmin giriniz : ");
            guess = input.nextInt();
            if(guess < 0 || guess > 100) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz." );
                if(isWrong) {
                    right ++;
                    System.out.println("Cok fazla hatali giris yaptiniz. Kalan hakkiniz: " + (5-right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (guess == randNumber) {
                System.out.println("Tebrikler, dogru tahmin! Tahmin ettigin sayi : " + randNumber);
                isWin =true;
                break;
            } else {
                System.out.println("Hatali bir sayi girdiniz!");
                if(guess > randNumber) {
                    System.out.println(guess + " sayisi, gizli sayidan buyuktur.");
                } else {
                    System.out.println(guess + " sayisi, gizli sayidan kucuktur." );
                }
                wrong[right ++] = guess; // kullanicinin yanlis tahminlerini sakliyor. her seferinde kacinci hakki kullandigini right ++ ile gostermi; oluruz.
                System.out.println("Kalan hakkiniz: "+ (5-right));
            }
        }

        if(!isWin) {
            System.out.println("Kaybettiniz!");
            if(!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}