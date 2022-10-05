import java.util.Scanner;

public class quadrat {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int nombre;
        int resultat;

        nombre = ent.nextInt();;
        resultat = (nombre*nombre);
        System.out.println(resultat);
    }
}
