import java.util.Scanner;

public class exbucleampliacio {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int opcio;
        byte comptador;

        System.out.println("0. Sortir");
        System.out.println("1  Solucio en for");
        System.out.println("2. Solucio en while");
        System.out.println("3. Solucio en do_while");
        System.out.println("Tria una opcio");

        do {

            comptador = -50;
            opcio = ent.nextInt();

            switch (opcio){
                case 0:
                    System.out.println("Adeu!");

                    break;
                case 1:
                    for (;comptador <= 5; comptador = (byte) (comptador+1) ){
                        System.out.print(comptador+ " es ");
                        if(comptador % 2 == 0) System.out.println(" parell");
                        else System.out.println(" imparell");

                    }
                    System.out.println("0. Sortir");
                    System.out.println("1  Solucio en for");
                    System.out.println("2. Solucio en while");
                    System.out.println("3. Solucio en do_while");
                    System.out.println("Tria una opcio");
/*
                    for (int i = comptador ; i<= 5; i = 1+1){
                        System.out.print(i+ " es ");
                        if(i % 2 == 0) System.out.println(" parell");
                        else System.out.println(" imparell");
                    }
*/
                    break;
                case 2: //while

                    while (comptador <= 5){
                        System.out.print(comptador+ " es ");
                        if(comptador % 2 == 0) System.out.println(" parell");
                        else System.out.println(" imparell");
                        comptador = (byte) (comptador+1);
                    }
                    System.out.println("0. Sortir");
                    System.out.println("1  Solucio en for");
                    System.out.println("2. Solucio en while");
                    System.out.println("3. Solucio en do_while");
                    System.out.println("Tria una opcio");

                    break;
                case 3:
                    do{
                        System.out.print(comptador+ " es ");
                        if(comptador % 2 == 0) System.out.println(" parell");
                        else System.out.println(" imparell");
                        comptador = (byte) (comptador+1);
                    }while (comptador <= 5);

                    System.out.println("0. Sortir");
                    System.out.println("1  Solucio en for");
                    System.out.println("2. Solucio en while");
                    System.out.println("3. Solucio en do_while");
                    System.out.println("Tria una opcio");

                    break;
                default:
                    System.out.println("Opcio Incorrecta");

            }

            }while(opcio != 0) ;

        }
    }

