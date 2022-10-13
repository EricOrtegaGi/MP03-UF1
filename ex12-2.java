import java.util.Scanner;

public class ex122 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num, comptador=0;

        System.out.println("Introdueix un enter");
        num = ent.nextInt();

        System.out.println("Els divisors de " + num + " son");
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) comptador++;

        }
        System.out.println(num);
        if (comptador==2) System.out.println("es primer");
        else System.out.println("no es primer.");
    }
}
