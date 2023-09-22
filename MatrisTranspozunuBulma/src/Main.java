public class Main {
    public static void main(String[] args) {
        // bir matris olusturalim.
        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6}
        };

        //Transpoz matrisi olusturalim. boyutu ise orijinal matrisin sutun sayisi ile satir sayisi olarak ayarla.
        int[][] transpose = new int[matris[0].length][matris.length];

        //Ic ice dongulerle orijinal matrisi transpoz matrisine kopyala, matrisin transpozunu hesaplamak icin.
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpose[j][i] = matris[i][j];
            }
        }
        // orijinal matrisi ekrana yazdiralim.printMatrix metodu tanimladik bunun icin.
        System.out.println("Orijinal Matris:");
        printMatrix(matris);

        //Transpoz matrisi ekrana yazdiralim.
        System.out.println("Transpoz Matris:");
        printMatrix(transpose);
    }

    //Matrisi ekrana duzgun sekilde yazdirmak icin kullanilan metot
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
