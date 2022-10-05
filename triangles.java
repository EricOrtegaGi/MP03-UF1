import java.util.Scanner;

public class triangles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        float dada1;
        float dada2;
        float resultat;

        dada1 = ent.nextInt();
        dada2 = ent.nextInt();

        resultat = (dada1*dada2/2);
        System.out.println(resultat);

    }
}
