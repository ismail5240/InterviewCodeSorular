package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru39_sayfa27 {
    public static void main(String[] args) {

        //ArrayList Read-Only-->ArrayList Salt Okunur

        List<String> fruitList = new ArrayList<String>();

        fruitList.add("Mango");//-->Mango
        fruitList.add("Banana");//-->Muz
        fruitList.add("Apple");//-->Elma
        fruitList.add("Strawberry");//-->Çilek
        fruitList.add("Pineapple");//-->Ananas

        System.out.println("Convarting ArrayList to Array");
        String[] item=fruitList.toArray(new String[fruitList.size()]);
        for (String s:item) {
            System.out.println(s + " ");

        }
        //Convert Array to ArrayList *** Diziyi ArrayList'e Dönüştür

        System.out.println("Convarting ArrayList to Array");
        List<String>l2=new ArrayList<>(),
                l3= Arrays.asList(item);//l2--l3-->?
        System.out.println(l3);
    }
}
