package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru6_sayfa11 {
    public static void main(String[] args) {

        //Swap numbers   ***  //Numaraları değiştir

        int a = 10;//-->20
        int b = 20;//-->10

        System.out.println("before swapping"); //değiştirmeden önce
        System.out.println("Volue of a:" + a);
        System.out.println("Volue of b:" + b);

        System.out.println("***After swapping*** "); //değiştirdikten sonra

        int degsm;

        degsm = a;

        a = b;
        System.out.println("a nın degişimden sonraki hali = " + a);//20

        b = degsm;
        System.out.println("b nin degişimden sonraki hali = " + b);//10

                        // second way
        int c=50;//-->40
        int d=40;//-->50

        System.out.println("before swapping");
        System.out.println("Volue of c:" +c);
        System.out.println("Volue of d" + d);

        System.out.println("***After swapping second way*** ");

        c = c - d;//c->10
        System.out.println("c nın degişimden sonraki hali ***= " + c);
        d = c + d;//10+40=50->d
        System.out.println("d nin degişimden sonraki hali ***= " + d);

        c = d - c;// 50-10->40->c

        System.out.println("c nın degişimden sonraki hali = " + c);
        System.out.println("d nin degişimden sonraki hali = " + d);

        System.out.println("****yeni deneme+++");

        int x=60;//--->40
        int y=40;//--->60

        x=x-y;//x=20
        y=x+y;//y=60 işlem yamam
        x=y-x;//x=40 işlem tamam
        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
