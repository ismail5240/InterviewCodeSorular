package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru19_sayfa17 {
    public static void main(String[] args) {

        //Reverse Number *** Ters Sayı

        int num=1234;
        int rev=0;

        while (num!=0){
            int n=num%10;//n1(4)-->n2(3)-->n3(2)-->n4(1)
            rev=rev*10+n;
            System.out.println(rev);//4-->43-->432-->4321
            num=num/10;
            System.out.println(num);//num1(123)-->num2(12)-->num3(1)-->0
        }
        //System.out.println(rev);//43
    }

}
