import java.util.Scanner;

public class multiplica3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numero1;
        int numero2;
        int multiplicador;
        int resultat1;
        int resultat2;

        numero1 = ent.nextInt();
        numero2 = ent.nextInt();
        multiplicador = 3;

        resultat1 = (numero1 * multiplicador);
        resultat2 = (numero2 * multiplicador);

        System.out.println(resultat1);
        System.out.println(resultat2);

    }
}
