package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru20_sayfa18 {
    public static void main(String[] args) {

        //Reverse string- for loop  ***  Ters dize- for döngüsü

        String str="ismail topdas";
        String rev="";

        for (int i=str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        System.out.println("rev = " + rev);
    }
}
