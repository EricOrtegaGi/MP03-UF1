import java.util.Scanner;

public class barrethogwarts {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.println("Que es el mes important per a tu?");
        
        String Paraula;

        Paraula = ent.nextLine();

        switch (Paraula) {

            case "Coratge":
                System.out.println("Gryffindor");
                break;
            case "Coneixement":
                System.out.println("Ravenclaw");
                break;
            case "Ambicio":
                System.out.println("Slytherin");
                break;
            default:
                System.out.println("Hufflepuff");
                break;
        }
    }
}

// he fet l'exercici de dues formes diferents, amb un switch i amb ifs i strings i de cap de les dues formes
//consegueixo que funcioni
