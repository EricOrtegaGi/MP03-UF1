import java.util.Scanner;

public class sumados {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int nombre1;
        int nombre2;
        int resultat;

        nombre1 = ent.nextInt();
        nombre2 = ent.nextInt();
        resultat = (nombre1 + nombre2);

        System.out.println(resultat);
    }
}
