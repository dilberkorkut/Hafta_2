

public class Main {

    public static double calcHarmonicMean(int[] list) { // tam sayi list parametre
        double harmonicSum = 0.0; // degisken olusturulur. dizinin elemanlarının ters değerlerinin toplamıni tutar.

        for (int i : list) { // bu dongu dizinin her elemanını i degiskenine sırayla atar.
            harmonicSum += 1.0 / i; // dizideki elemanlarin terslerinin toplami
        }

        return list.length / harmonicSum; //formul
    }

    public static void main(String[] args) {
        int[]numbers = {1,2,3,4,5}; //tamsayi dizisi

        double harmonicMean = calcHarmonicMean(numbers); //calcHarmonicMean fonksiyonu bu diziyi alır.harmonik ortalamayı hesaplar/harmonicMean değişkenine atar.
        System.out.println("Harmonik Ortalama: " + harmonicMean);
    }
}
