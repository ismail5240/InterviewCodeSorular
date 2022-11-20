package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.İkiniKısım;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Soru48_sayfa33 {
    public static void main(String[] args) {

//print date and time-->tarih ve saati yazdır

       DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyyy/MM/dd HH:mm:ss");
        LocalDateTime now= LocalDateTime.now();
        System.out.println(df.format(now));







    }

}
