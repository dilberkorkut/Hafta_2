import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(arr);

        int number = arr[0];
        int count = 1;

        System.out.println("Dizi: " + Arrays.toString(arr));
        System.out.println("Tekrar Sayilari");

        for (int i = 1; i< arr.length; i++) {
            if (arr[i] == number) {
                count ++;
            } else {
                System.out.println( number + " sayisi " + count + " kere tekrar edildi.");
                number = arr[i];
                count = 1;
            }
        }
        //SOn elemanin frekansini ekrana yazdiracagiz.
        System.out.println(number + " sayisi" + " kere tekrar edildi.");
    }
}