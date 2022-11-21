package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru13_sayfa15 {
    public static void main(String[] args) {

        //Sum of the natural Number  ***  Doğal Sayının Toplamı

        int num=50;
        int sum=0;
        int sum1=0;



        for (int i=0; i<=num;i++){
            sum=sum+i;

        }
        System.out.println("sum = " + sum);

        System.out.println("********");// second way

        int sayac=1;
        while(sayac<=num){
            sum1=sum1+sayac;
            sayac++;
        }
        System.out.println("sum1 = " + sum1);
    }
}
