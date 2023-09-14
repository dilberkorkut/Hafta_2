import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Taban sayi: ");
        int taban = inp.nextInt();

        System.out.print("Us sayisi yaziniz: ");
        int us = inp.nextInt();

        int result = 1;

        int i = 1;
        while(i<=us) {
            result *= taban;
            i++;
        }
        System.out.println("Sonuc: " +result);

    }
}