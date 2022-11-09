package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru24_sayfa20 {
    public static void main(String[] args) {

        //Power number

        // 3^4=81
        int base = 2, exponet = 5;
        long result = 1;
        while (exponet != 0) {
            result *= base;
            --exponet;
        }
        System.out.println("Answer=" + result);
    }
}
