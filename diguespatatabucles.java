import java.util.Scanner;

public class diguespatatabucles {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int cas;
        String paraules;
        
        cas = ent.nextInt();

        while( cas != 0) {
            paraules = ent.nextLine();
            cas = (cas -1);
            System.out.println(paraules);
        }
    }
}
