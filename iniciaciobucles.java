import java.util.Scanner;

public class iniciaciobucles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int positius;
        int n;
        int comptador;

        comptador = 0;
        n = ent.nextInt();
        positius = 0;

        while (comptador < n ) {

            if (ent.nextInt() >= 1 )  positius = (positius + 1);
            comptador = (comptador + 1);
        }
        System.out.println(positius);
    }
}
