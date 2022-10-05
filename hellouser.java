import java.util.Scanner;

public class hellouser {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        String nom = input.nextLine();

        System.out.println("Hola, "+ nom);
    }
}
