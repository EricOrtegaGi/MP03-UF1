package nf2;

import com.sun.jdi.LocalVariable;

import java.util.Scanner;

public class basketmania {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String Equip;

        int Local = 0;
        int Visitant = 0;

        int casos;
        int K;

        casos = ent.nextInt();

        while (casos != 0) {
            K = ent.nextInt();
            while (K != 0) {
              Equip = ent.next();
              if (Equip == "L") {
                  Local += ent.nextInt();
              }else Visitant += ent.nextInt();

            }
            if (Local > Visitant) {
                System.out.println("L" + Local + Visitant);
            } else if (Visitant > Local) {
                System.out.println("V" + Visitant + Local);

            }else if (Local == Visitant) {
                System.out.println("E" + Local + Visitant);
            }
        }
    }
}
