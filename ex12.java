import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int num;
        int divisor;
        System.out.println("introdueix el numero");
        num = ent.nextInt();

        divisor = 2;

        for (int i = 0; i <= 10; i++) {

            if (num % divisor ==0 ){
                System.out.println(divisor + "");
                num = num/divisor;
            }else {
                divisor ++;
            }

        }
    }
}
