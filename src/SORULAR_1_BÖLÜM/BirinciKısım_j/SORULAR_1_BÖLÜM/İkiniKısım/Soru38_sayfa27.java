package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru38_sayfa27 {
    public static void main(String[] args) {

        //Convert Array to ArrayList *** Diziyi ArrayList'e Dönüştür
        //unmodifiableList-->değiştirilemez liste

        List<String> fruitList = new ArrayList<String>();

        fruitList.add("Mango");//-->Mango
        fruitList.add("Banana");//-->Muz
        fruitList.add("Apple");//-->Elma
        fruitList.add("Strawberry");//-->Çilek
        fruitList.add("Pineapple");//-->Ananas

        List<String>unmodifiableList= Collections.unmodifiableList(fruitList);
        //read- only
       // unmodifiableList.add("INDIA");//EXP
        System.out.println(fruitList);

    }
}
