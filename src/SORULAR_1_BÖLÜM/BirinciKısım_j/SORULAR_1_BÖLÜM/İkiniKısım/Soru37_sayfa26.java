package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.util.ArrayList;
import java.util.List;

public class Soru37_sayfa26 {
    public static void main(String[] args) {

        //Convert ArrayList to Array *** ArrayList'i Array'e Dönüştür

        // creating Arraylist-->Dizi listesi oluşturma

        List<String> fruitList = new ArrayList<String>();

        // adding String Objects  to fruitlist ArrayList-->ArrayList meyve listesine Dize Nesneleri ekleme

        fruitList.add("Mango");//-->Mango
        fruitList.add("Banana");//-->Muz
        fruitList.add("Apple");//-->Elma
        fruitList.add("Strawberry");//-->Çilek
        fruitList.add("Pineapple");//-->Ananas

        System.out.println("Convarting ArrayList to Array");
        String[] item=fruitList.toArray(new String[fruitList.size()]);
        for (String s:item){
            System.out.println(s+" ");
        }
    }
}
