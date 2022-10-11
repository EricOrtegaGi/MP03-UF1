import java.util.Scanner;

public class exercici11 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        double base;

        base = ent.nextDouble();

        for (int i = 0; i <= 10; i++) {

            System.out.println(Math.pow(base, i));

        }
    }
}
