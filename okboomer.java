import java.util.Scanner;

public class okboomer {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int any;

        any = ent.nextInt();

        if (any >= 1945 && any <= 1965) {

            System.out.println("ok boomer");
        }
        else System.out.println("nah");
    }
}
