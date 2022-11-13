package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru41_sayfa28 {
    public static void main(String[] args) {


        //Reverse ArrayList-->Ters DiziListesi

        List<String> l = new ArrayList<String>();

        l.add("Mango");//-->Mango
        l.add("Banana");//-->Muz
        l.add("Mango");//-->Elma
        l.add("Apple");//-->Çilek
        System.out.println("Before Reversing");
        System.out.println(l.toString());

        System.out.println("**********");

        Collections.reverse(l);
        System.out.println("After Reversing");
        System.out.println(l);
    }
}
