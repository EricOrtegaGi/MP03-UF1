import java.util.Scanner;

public class pambtomaquet {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String paraula1;
        String paraula2;
        String sortida;

        paraula1 = ent.nextLine();
        paraula2 = ent.nextLine();

        sortida = (paraula1 + " amb " + paraula2);
        System.out.println(sortida);
    }
}
