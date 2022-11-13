package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.util.Scanner;

public class Soru42_sayfa29 {
    public static void main(String[] args) {

        //Simple Calculator-->Basit Hesap Makinesi
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two numbers");

        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.println("Please enter an operator(+,-,*,/);");//-->Lütfen bir operatör girin

        char operator = reader.next().charAt(0);

        double result=0;

        switch (operator){
            case '+':
                result=first+second;
            case '-':
                result=first-second;
            case '*':
                result=first*second;
            case '/':
                result=first/second;
            default:
                System.out.println("Please pass teh correct operator");//-->Lütfen doğru operatörü iletin
                break;
        }
        System.out.println(result);

    }
}
