package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

public class Soru29_sayfa22 {
    public static void main(String[] args) {

        // Steps *** Adımlar

        /*
         *1
         * 12
         * 123
         * 1234
         * 12345
         */

        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

    }
}
