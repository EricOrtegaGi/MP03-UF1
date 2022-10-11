import java.util.Scanner;

public class sumaposnegbucles {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int num;
        int npos;
        int nneg;
        int invalid;

        invalid = 0;
        num = 10;
        npos = 0;
        nneg = 0;

        while (num != 0) {
            num = ent.nextInt();
            if (num >= 1) npos ++;
            else if (num == 0) {
                invalid ++;
            }
                else nneg ++;
        }
        if (npos > nneg)System.out.println("POSITIUS");
        else if (npos == nneg) {
            System.out.println("IGUALS");
        } else System.out.println("NEGATIUS");
    }
}
