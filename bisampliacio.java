//el valor inicial i final el tria l'usuari

import java.util.Scanner;

public class bisampliacio {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        byte numero; // variable de control del bucle
        byte numero2; // variable de control del bucle
        byte temporal; //la utilitzem per intercanviar els valors de numero i numero2

        System.out.println("introdueix dos numeros, el numero inicial te que ser mes petit que el final");
        numero = ent.nextByte();
        numero2 = ent.nextByte();

        if (numero > numero2)

        while (numero <= numero2 && numero!=127){ // condicio on apareixen les variables de control
            System.out.print(numero+ " es ");
            if(numero% 2 == 0) System.out.println(" parell");
            else System.out.println(" imparell");
            numero = (byte) (numero+1); // actualitzacio de la variable de control
        }
        if(numero2 == 127) System.out.println("127 es imparell");
    }
}
