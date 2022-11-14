package nf2;

import java.util.Scanner;

public class puntg {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);


        char L1 = ent.next().charAt(0);
        char L2 = ent.next().charAt(0);
        char L3 = ent.next().charAt(0);
        char L4 = ent.next().charAt(0);
        char L5 = ent.next().charAt(0);

        if (L1 == 'G' && L2 == 'G' && L3 == 'G' && L4 == 'G' && L5 == 'G' || L1 == 'G' && L2 == 'G' ||  L2 == 'G' && L3 == 'G' || L3 == 'G' && L4 == 'G' || L4 == 'G' && L5 == 'G' ||L1 == 'G' && L5 == 'G') {
            System.out.println("PUNTOS");
        } else if (L1 == 'G'|| L2== 'G' || L3 == 'G'|| L4 == 'G'|| L5 == 'G') {
            System.out.println("SI");
        }else System.out.println("NO");


    }
}
