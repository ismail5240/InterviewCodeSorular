package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru25_sayfa20 {
    public static void main(String[] args) {

        // polindrome Number   ***  palindrom sayısı

        int num=121;
        int rev=0;

        int actualNum=num;
        while (num !=0){
            int n=num%10;
            rev=rev*10+n;
            num=num/10;
        }
        System.out.println(rev+":rev");

        if (actualNum==rev){
            System.out.println(actualNum+":Palindrome");
        }else{
            System.out.println(actualNum+":Palindrome değil");
        }


    }
}
