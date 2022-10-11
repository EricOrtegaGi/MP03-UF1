import java.util.Scanner;

public class caramelsobrants {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int caramels;
        int nens;
        int restants;

        caramels = ent.nextInt();
        nens = ent.nextInt();

        if (caramels > nens){
            restants = (caramels/nens);
            System.out.println(restants);
        }


    }
}
