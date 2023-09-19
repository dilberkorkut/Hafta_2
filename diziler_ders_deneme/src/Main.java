public class Main {
    public static void main(String[] args) {
        /* İstediğiniz boyutta matris oluşturarak matris
           değerlerine 0-99 arası random sayılar üreterek
           matrise atama yapınız.*/
        int[][] matrix = new int[3][4];
        for (int row = 0; row< matrix.length; row ++) {
            for (int column = 0; column < matrix.length; column ++) {
                matrix [row][column] = (int) (Math.random() * 100);
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}

