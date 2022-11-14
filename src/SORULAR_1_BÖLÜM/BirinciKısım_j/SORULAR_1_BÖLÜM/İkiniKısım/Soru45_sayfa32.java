package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

public class Soru45_sayfa32 {
    public static void main(String[] args) {

        //Factorial Recursive


        System.out.println(multiplyNum(5));
        System.out.println(multiplyNum(3));
    }

    private static int multiplyNum(int num) {

        if(num>=1){
            return num * multiplyNum(num-1);
        }else{
            return 1;
        }
    }


}
