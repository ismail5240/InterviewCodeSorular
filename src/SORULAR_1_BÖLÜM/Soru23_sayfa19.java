package SORULAR_1_BÖLÜM;

public class Soru23_sayfa19 {
    public static void main(String[] args) {

        //Prime number  ***  asal sayı
        int num = 29;
        boolean flog = false;
        for (int i=2;i<=num/2; i++){
           if (num % i==0){
               flog=true;
               break;
           }
        }
        if (!flog)
            System.out.println(num+":Asal sayı");
        else
            System.out.println(num+":Asal sayı degildir");
    }
}
