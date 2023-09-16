import java.util.Scanner;
public class Main {

    static int tempNumber;
    static int cikar (int number) {

        if (number<=0) {
            return topla(number);
        }
        System.out.print(number+ " ");
         return cikar(number-5);
    }
    static int topla (int number) {

        if(number==tempNumber) {
            return number;
        }
        System.out.print(number + " ");
        return topla( number + 5);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz: ");
        int number = input.nextInt();
        input.close();

        tempNumber = number;
        System.out.println(cikar(number));
    }
}