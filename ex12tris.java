import java.util.Scanner;

public class ex12tris {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num;
        int suma;

        suma = 0;

        System.out.println("introdueix el numero");

        num = ent.nextInt();

        for (int u1 = 1; u1 < num; u1++) {
            if (num % u1 == 0) {
                suma = u1 + suma;
                //System.out.println(u1);

            }

        }
        if (suma == num) {
            System.out.println(num + " es perfecte");
        } else System.out.println(num + " no es perfecte");


    }
}
