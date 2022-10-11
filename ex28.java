import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        long primer;
        long entrada;
        long comptador;
        long suma;

        primer = ent.nextLong();

        comptador = 0;
        suma = 0;

        suma = primer + suma;
        do {
            entrada = ent.nextLong();
            suma = entrada + suma;
            System.out.println(suma);
            comptador ++;

        } while (entrada != primer);
        System.out.println(suma);
        System.out.println(comptador);
    }
}
