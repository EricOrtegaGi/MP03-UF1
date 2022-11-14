package nf2;

import java.util.Scanner;

public class veri {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int redhp;
        int dmgrammus;
        int dmgtwitch;
        int rammus = 0;
        int twitch = 0;
        int casos = ent.nextInt();

        while (casos != 0) {

            redhp = ent.nextInt();
            dmgrammus = ent.nextInt();
            dmgtwitch = ent.nextInt();
            
            if (dmgrammus - redhp == 0){
                rammus ++;
                System.out.println("RAMMUS" +rammus);
            }else if (dmgrammus + dmgtwitch - redhp == 0) {
                twitch ++;
                System.out.println("TWITCH" + twitch);
                
            }


        }








    }
}
