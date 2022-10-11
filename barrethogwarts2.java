import java.util.Scanner;

public class barrethogwarts2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String paraula;

        paraula = ent.nextLine();

        if (paraula == "Coratge") {
            System.out.println("Gryffindor");
        } else if (paraula == "Coneixement") {
            System.out.println("Ravenclaw");
        } else if (paraula == "Ambicio") {
            System.out.println("Slytherin");
        } else System.out.println("Hufflepuff");


    }
}

// he fet l'exercici de dues formes diferents, amb un switch i amb ifs i strings i de cap de les dues formes
//consegueixo que funcioni