package nf2;

import java.util.Scanner;

public class pokerdedaus {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int a = ent.nextInt();
        int b = ent.nextInt();
        int c = ent.nextInt();
        int d = ent.nextInt();



        if (a == b && b == c && c == d) {
            System.out.println("POKER");
        }else if (a == b &&  b == c || a == b && b == d || a == c && c == d || b == c && c == d) {
            System.out.println("TRIO");
        }else if (a == b || a == c || a == d || b == c || b == d || c == d) {
            System.out.println("PARELLA");
        }else System.out.println("RES");
    }
}
