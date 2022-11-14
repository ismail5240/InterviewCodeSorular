package SORULAR_1_BÖLÜM.BirinciKısım_j.SORULAR_1_BÖLÜM.BirinciKısım;

public class Soru8_sayfa12 {
    public static void main(String[] args) {

        //Questions: Check whether on alphobet is vowel or consonant
        //Sorular: Bir alfabenin ünlü mi yoksa ünsüz mü olduğunu kontrol edin
        // a e i o u

        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + ":ünlü harfi buldunuz");
        } else {
            System.out.println(ch + ":ünsüz harfi buldunuz");
        }


        // second way
        System.out.println("*****second way*****");

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println(ch + ":**ünlü harfi buldunuz**");
                break;
            default:
                System.out.println(ch + ":**ünsüz harfi buldunuz**");

           /*         //3. yol

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Bir String giriniz :");
                    String str = scanner.nextLine();

                    String s = "aeiuıoöuü";
                    for (int i = 0; i < s.length(); i++) {
                        for (int j = 0; j < str.length(); j++) {
                            if (s.charAt(i) == (str.charAt(j)))
                                System.out.println("girdiğiniz stringde " + s.charAt(i) + " sesli harfi bulunmaktadır. ");
                        }

                    }


        }

            */
        }
    }}
