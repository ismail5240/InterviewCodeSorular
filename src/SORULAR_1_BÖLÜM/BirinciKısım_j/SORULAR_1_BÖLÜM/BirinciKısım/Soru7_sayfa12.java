package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

import java.util.Scanner;

public class Soru7_sayfa12 {
    public static void main(String[] args) {

        //Question even or odd number  *** // Soru çift veya tek sayı

        Scanner sc = new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz");

        int num = sc.nextInt();
        if (num%2 ==0){
            System.out.println("girilen sayı Çift="+num);

        }else{
            System.out.println("girilen sayı Tek="+num);
        }



    }
}
