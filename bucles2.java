import java.util.Scanner;

public class bucles2 {

    public static void main(String[] args) {

        // programa que demana un enter a l'usuari i mostra la sequencia d'1 fins al numero introduit

        // declaracio de variables
        Scanner ent = new Scanner(System.in);
        byte numero, comptador=1;


        //Demanem entrada a l'usuari
        System.out.println("Introdueix un numero enter qualsevol:");
        numero = ent.nextByte();

        //Mostrar la sortida
        /*
        while (condicio){

    }
        System.out.println("Estas fora del bucle");
        */

        while (comptador <= numero){
            System.out.println(comptador);
            comptador = (byte) (comptador + 1);
        }
        if( numero>=comptador )System.out.println(comptador);
        comptador = (byte) (comptador + 1);
}}

