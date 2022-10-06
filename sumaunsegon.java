import java.util.Scanner;

public class sumaunsegon {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int H;
        int M;
        int S;

        H = ent.nextInt();
        M = ent.nextInt();
        S = ent.nextInt();

        S = S+1;

        if (S >= 59) {
            S = 0;
            M = M+1;
            if (M >= 60) {
                M = 0;
                H = H+1;
                if (H > 23){
                    H = 0;
                }
            }
        }
        System.out.println(H+"\n" + M +"\n" + S +"\n");


    }
}
