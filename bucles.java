import java.util.Scanner;

public class bucles {

    public static void main(String[] args) {

        // programa que demana un enter a l'usuari i mostra la sequencia d'1 fins al numero introduit

        // declaracio de variables
        Scanner ent = new Scanner(System.in);
        byte numero, comptador=1;

        //Demanem entrada a l'usuari
        System.out.println("Introdueix un numero enter qualsevol:");
        numero = ent.nextByte();

        //Mostrar la sortida

        if( numero>=comptador )System.out.println(comptador);
        comptador = (byte) (comptador + 1);
        if( numero>=2 )System.out.println(2);
        if( numero>=3 )System.out.println(3);
        if( numero>=4 )System.out.println(4);
        if( numero>=5 )System.out.println(5);
        if( numero>=6 )System.out.println(6);
        if( numero>=7 )System.out.println(7);
        if( numero>=8 )System.out.println(8);
        if( numero>=9 )System.out.println(9);
        if( numero>=10 )System.out.println(10);

    }
}
