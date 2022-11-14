package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru9_sayfa13 {
    public static void main(String[] args) {
        //Question:largest and smallest numbers finding
        //Soru:en büyük ve en küçük sayıları bulma

        int x = 100;
        int y = 300;
        int z = 200;

        // first way

        if (x > y && x > z) {
            System.out.println(x + "=x: en büyük sayı");
        } else if (y > z) {
            System.out.println(y+"=y en büyük sayı");
        } else {
            System.out.println(z+"=z en büyük sayı");
        }

        if (x < y && x < z) {
            System.out.println(x + "=x: en küçük sayı");
        } else if (y < z) {
            System.out.println(y+"=y en küçük sayı");
        } else {
            System.out.println(z+"=z en küçük sayı");
        }


                                  //second way

        if (x >= y) {
            if (x >= z) {
                System.out.println(x + "=x: en büyük sayı");

            } else {
                System.out.println("z en büyük sayı");
            }
        } else {
            if (y >= z) {
                System.out.println("y en büyük sayı");

            } else {
                System.out.println("z en büyük sayı");
            }
        }


    }
}
