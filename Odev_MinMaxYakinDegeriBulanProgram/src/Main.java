import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int target = scanner.nextInt();

        int closestSmaller = list[0];
        int closestLarger = list[list.length-1];

        for (int number : list) {
            if (number < target && number > closestSmaller) {
                closestSmaller = number;
            } else if (number > target && number < closestLarger) {
                closestLarger = number;
            }
        }

        if (closestSmaller != list[0]) {
            System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        }
        if (closestLarger != list[list.length-1]) {
            System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);
        }
        else {
            System.out.println("Uygun sayi bulunmamaktadir.");
        }


    }

}