//import java.util.Arrays;

public class Main {
    static boolean isFind(int[]arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[]dublicate = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i < list.length; i ++) {

            for(int j = 0; j < list.length; j ++) {
                if( i != j && list [i] == list[j]){
                    if(!isFind(dublicate , list[i])) {
                        dublicate[startIndex++] = list[i];
                    }

                    break;
                }
            }
        }
       // System.out.println(Arrays.toString(dublicate)); boyle olunca dizi icinde gosteriyor, dizinin alan elemanlarini 0 olarak gosteriyor.
        for (int value : dublicate) {
            if( value != 0) {
                System.out.println(value);
            }
        }
    }
}