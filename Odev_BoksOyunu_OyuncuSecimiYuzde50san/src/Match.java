public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    String firstFighter;

    Match (Fighter f1, Fighter f2, int minWeight, int maxWeight, String firstFighter) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.firstFighter = firstFighter;
    }

    void run(){
        if(isCheck()) {

            System.out.println("İlk dövüşe başlayacak oyuncu: " + firstFighter);

        }

    }

    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);

    }
}
