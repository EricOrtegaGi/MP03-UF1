import java.util.Scanner;

public class nota10bucles {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int nota = 0;
        int notes;
        int notes10;

        notes = 0;
        notes10 =  0;

        while(nota != -1){
            nota = ent.nextInt();
            if(nota == 10) notes10 = (notes10 +1);
            if(nota >= 0 && nota <= 10) notes ++;
        }
        System.out.println("TOTAL NOTES: "+notes +" NOTES10: "+notes10);
    }
}
