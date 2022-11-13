package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.util.*;

public class Soru40_sayfa28 {
    public static void main(String[] args) {

        //Remove duplicate in ArrayList-->ArrayList'teki kopyayı kaldırın

        List<String> l = new ArrayList<String>();

        l.add("Mango");//-->Mango
        l.add("Banana");//-->Muz
        l.add("Apple");//-->Elma
        l.add("Strawberry");//-->Çilek
        l.add("Pineapple");//-->Ananas

        System.out.println(l.toString());
        Set<String> s=new LinkedHashSet<String>(l);
        System.out.println(s);
    }
}
