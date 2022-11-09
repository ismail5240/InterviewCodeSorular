package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

public class Soru26_sayfa21 {
    public static void main(String[] args) {

        //Prime Number Interval  ***  Asal Sayı Aralığı

        //20 to 50

        int low = 2;
        int high = 10;

        while (low < high) {
            boolean flog = false;
            for (int i = 2; i <= low / 2; i++) {

                if (low % i == 0) {
                    flog = true;
                    break;
                }
            }
            if (!flog && low != 0 && low != 1)
                System.out.println(low + ":Asal sayı ");
            low++;
        }


    }
}
