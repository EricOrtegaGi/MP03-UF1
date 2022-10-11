import java.util.Scanner;

public class ex12bis {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num;

        System.out.println("introdueix el numero");

        num = ent.nextInt();

        for (int u1 = 1; u1 <= num; u1++) {
            if (num % u1 == 0) {
                System.out.println(u1);
            }
        }
    }
}
