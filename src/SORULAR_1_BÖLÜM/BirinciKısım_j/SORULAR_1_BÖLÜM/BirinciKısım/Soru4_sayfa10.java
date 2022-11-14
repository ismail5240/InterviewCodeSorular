package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru4_sayfa10 {
    public static void main(String[] args) {

        //Question:Volue of ASCII of characters *** //Soru: Karakterlerin ASCII değeri

        char c= 'a';
        char b='A';
        //frist way  ***  //ilk yol
         int b2=b;
       int ascii=c;
       int a2=c;
       System.out.println("ascii = " + ascii);
       System.out.println(c);
       System.out.println("c nin içerisindeki 'a' karekterin Ascıı degeri = " + a2);
       System.out.println("b nin içerisindeki 'A' karekterin Ascıı degeri = " + b2);

        // second way  *** //ikinci yol
        int asciiNum=(int)c;
      System.out.println("asciiNum = " + asciiNum);
        System.out.println((int) c);//tek satırda da yazdırılabilir

    }
}
