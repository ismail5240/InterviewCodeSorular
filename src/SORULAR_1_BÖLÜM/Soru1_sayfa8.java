package SORULAR_1_BÖLÜM;

import java.util.Scanner;

public class Soru1_sayfa8 {

    public static void main(String[] args) {

        // Question: print on integer getting input from user  ***  // Soru: kullanıcıdan girdi alan tamsayıya yazdır

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = reader.nextInt();

        System.out.println("num = " + num);

    }
}
