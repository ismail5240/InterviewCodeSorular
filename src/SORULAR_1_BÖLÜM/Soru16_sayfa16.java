package SORULAR_1_BÖLÜM;

public class Soru16_sayfa16 {
    public static void main(String[] args) {

        // Fibonacci series
        // 0 1 1 2 3 5 8 13 21 34

        int num=10;
        int a=0;
        int b=1;

        for (int i=1; i<=num; i++){
            System.out.println("a = " + a);
            int sum= a+b;
            a=b;
            b=sum;
        }

    }
}
