package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

public class Soru43_sayfa30 {
    public static void main(String[] args) {


        //Check two prime number sum-->İki asal sayı toplamını kontrol edin-->

        int num = 5;
        int sum = addNum(num);
        System.out.println("sum is:" + sum);
    }


    private static int addNum(int num) {
        if (num != 0) {
            return num + addNum(num - 1);

        } else {
            return num;
        }
    }
}
