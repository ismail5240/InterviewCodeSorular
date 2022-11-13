package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.util.Arrays;

public class Soru36_sayfa26 {
    public static void main(String[] args) {

        //Find first two max number in Array *** Dizideki ilk iki maksimum sayıyı bulun

        int[] arr = {1, 2, 3, 4, 56, 57, 5, 8};

        getTwoMaxVolues(arr);

    }//main sonu

    private static void getTwoMaxVolues(int[] nums) {
        int mazOne = 0;
        int mazTwo = 0;
        Arrays.sort(nums);
        System.out.println("Max 1-" + (nums[nums.length - 1]));
        System.out.println("Max 2-" + (nums[nums.length - 2]));

    }


}
