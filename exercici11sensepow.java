import java.util.Scanner;

public class exercici11sensepow {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double base, x = 1;

        System.out.println("Introdueix un numero cualsevol");

        base = ent.nextDouble();

        System.out.println("1");

        for (int i = 1; i <= 10; i++) {

            System.out.println(x * base );
            x = x * base;

        }
    }
}
