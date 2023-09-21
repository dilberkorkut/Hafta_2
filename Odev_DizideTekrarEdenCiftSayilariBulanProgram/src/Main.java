

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
        int[]list = {4, 7, 4, 3, 2, 9, 10, 12, 1, 12, 10, 1};
        int[]dublicate = new int[list.length];
        int dulicateIndex = 0;

        for(int i = 0; i < list.length; i ++) {
            for(int j = 0; j < list.length; j ++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0) && (list[j] % 2 == 0)) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[dulicateIndex++] = list[i];
                    }
                }
            }
        }


        for (int value : dublicate) {
            if( value != 0) {
                System.out.println(value);
            }
        }
    }
}