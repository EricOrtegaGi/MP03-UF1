import java.util.Scanner;

public class numbinaris {

    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int comptador = 0;
        int cas = 0;
        int resultat;


        cas = ent.nextInt();


        while (comptador != cas){
            int dec1 = ent.nextInt();
            String operator = ent.next();
            int dec2 = ent.nextInt();

            if (operator == "+") {
                resultat = dec1 + dec2;
            }else resultat = dec1 - dec2;

            System.out.println(Integer.toBinaryString(resultat));

            comptador++;

        }
    }
}
