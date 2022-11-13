package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

public class Soru35_sayfa25 {
    public static void main(String[] args) {

        //Largest number in Array using for loop *** for döngüsü kullanan Dizideki en büyük sayı

        int[] arr = {1, 2, 3, 4, 56, 57, 5, 8};
        System.out.println(getLargest(arr, 7));


    }

    public static int getLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
        return a[total - 1];
    }

}
