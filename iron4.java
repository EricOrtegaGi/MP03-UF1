package nf2;

import java.util.Scanner;

public class iron4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String tecla = ent.nextLine();

        switch (tecla) {
            case "Q":
                System.out.println("Skill 1");
                break;
            case "W":
                System.out.println("Skill 2");
                break;

            case "E":
                System.out.println("Skill 3");
                break;

            case "R":
                System.out.println("Ultimate");
                break;

            case "B":
                System.out.println("Recall");
                break;

            case "D":
                System.out.println("Bronzes never use summoners");
                break;

            case "F":
                System.out.println("Bronzes never use summoners");
                break;
            default:
                System.out.println("Error");

        }

    }
}
