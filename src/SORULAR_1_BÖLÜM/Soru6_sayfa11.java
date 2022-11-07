package SORULAR_1_BÖLÜM;

public class Soru6_sayfa11 {
    public static void main(String[] args) {

        //Swap numbers   ***  //Numaraları değiştir

        int a = 10;
        int b = 20;

        System.out.println("before swapping"); //değiştirmeden önce
        System.out.println("Volue of a:" + a);
        System.out.println("Volue of b:" + b);

        System.out.println("***After swapping*** "); //değiştirdikten sonra

        int degsm;

        degsm = a;

        a = b;
        System.out.println("a nın degişimden sonraki hali = " + a);

        b = degsm;
        System.out.println("b nin degişimden sonraki hali = " + b);

                        // second way

        System.out.println("before swapping");
        System.out.println("Volue of a:" + a);
        System.out.println("Volue of b:" + b);

        System.out.println("***After swapping second way*** ");

        a = a - b;
        System.out.println("a nın degişimden sonraki hali ***= " + a);
        b = a + b;
        System.out.println("b nin degişimden sonraki hali ***= " + b);

        a = b - a;// bunu neden yazmıs etkisi yok

        System.out.println("a nın degişimden sonraki hali = " + a);
        System.out.println("b nin degişimden sonraki hali = " + b);

    }
}
