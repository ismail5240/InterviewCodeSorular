package SORULAR_1_BÖLÜM;

public class Soru10_sayfa14 {
    public static void main(String[] args) {

        // find leap year  //artık yılı bul

        int yıl=1900;
        boolean artık=false;
        if (yıl%4==0){
            if (yıl%100==0){
                if (yıl%400==0)
                    artık=true;
                else artık=false;
            }
           else artık=true;
        }else artık=false;

        if (artık){
            System.out.println(yıl+":Artık yıldır");
        }            else System.out.println(yıl+":Artık yıl değildir");



    }
}
