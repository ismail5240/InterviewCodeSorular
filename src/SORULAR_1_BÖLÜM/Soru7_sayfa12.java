package SORULAR_1_BÖLÜM;

import java.util.Scanner;

public class Soru7_sayfa12 {
    public static void main(String[] args) {

        //Question even or odd number  *** // Soru çift veya tek sayı

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        int num = sc.nextInt();
        if (num%2 ==0){
            System.out.println(num+"=girilen sayı Çift");

        }else{
            System.out.println(num+"=girilen sayı Tek");
        }



    }
}
