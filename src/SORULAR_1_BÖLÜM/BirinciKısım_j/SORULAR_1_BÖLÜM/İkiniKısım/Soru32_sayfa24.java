package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

public class Soru32_sayfa24 {
    public static void main(String[] args) {

       // Fibonacci For Loop *** Döngü için Fibonacci

        int a=0;
        int b=1;

        System.out.println(a+" "+b+" ");

        for (int i=2; i <=10; i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c + " + " );
        }

    }
}
