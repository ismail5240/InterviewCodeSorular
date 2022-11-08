package SORULAR_1_BÖLÜM;

public class Soru18_sayfa17 {
    public static void main(String[] args) {


        // Number of digits  *** Basamak sayısı

        //1234-->4
        //123-->3

        long num=1234567;
        long num2=52405236;
        int count=0;

        while (num!=0){
            num=num/10;
            count++;
        }
        System.out.println("count = " + count);
        while (num2!=0){
            num2=num2/10;
            count++;
        }
        System.out.println("count2 = " + count);
    }
    }
