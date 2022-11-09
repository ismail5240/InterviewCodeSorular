package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

public class Soru27_sayfa21 {
    public static void main(String[] args) {

        //Armstrong Number *** Armstrong Numarası

        //153= 1*1*1  5*5*5  3*3*3 =1+125+27 =153

        int num = 153;
        int number;
        int temp;
        int top = 0;

        number = num;
        while (number != 0) {

            temp = number % 10;
            top = top + temp * temp * temp;
            number /= 10;
        }
        if (top == num)
            System.out.println("Armstrond:" + num);
        else
            System.out.println("Armstrond numara değil" + num);
    }
}
