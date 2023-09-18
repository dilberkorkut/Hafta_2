public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
// musabakaya baslamadan once bir run metodu olusturuyoruz.
// dovusculerin agirliklari bu araliklara firiyor mu ona bakacagiz.
// true false donduren bir kontol

    void run(){
        if(isCheck()){ // dovusculer birbirine vuracak.
            // ne kadar vuracaklarini bilmedigimiz icin while dongusu kullanilacak.
            // sirayla birbirlerine vurup canlarini sifirin altina dusurecekler.
            while(this.f1.health > 0 && this.f2.health > 0) { // herhang' birinin saglifi
                //0'in altina dusunce mac bitecek. ornegin f1 baslasin
                // basit bir hit adinda bir metot yazalim fighter sinifina gec.System.out.println("====YENI ROUND");
               this.f2.health = this.f1.hit(this.f2);
               if(isWin()) { // her vurustan sonra kontrol gerekiyor.
                   break;
               }
               this.f1.health = this.f2.hit(this.f1);
               if(isWin()) {
                   break;
               }
                System.out.println(this.f1.name + " Saglik: " + this.f1.health);
                System.out.println(this.f2.name + " Saglik: " + this.f2.health);

              // surekli birbirlerine vurduklari icin program bitiyor
                // bir kontrol gerekiyor. isWin true false donecek.
            }
        } else {
            System.out.println("Sporcularin sikletleri uymuyor!");
        }
    }

    boolean isCheck(){
        return(this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandi!");
            return true;
        }

        if(this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandi!");
        }

        return false;
    }
}
