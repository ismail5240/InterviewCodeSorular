package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Soru34_sayfa25 {
    public static void main(String[] args) {

        //Largest number in Array using Collections *** Koleksiyonları kullanan Dizideki en büyük sayı

        Integer x[] ={4,3,5,76,89};
        System.out.println(getLargest(x,4));

    }
    public static int getLargest(Integer[] a,int total){
        List<Integer> list= Arrays.asList(a);
        Collections.sort(list);
        int element=list.get(total-1);
        return element;
    }
}
