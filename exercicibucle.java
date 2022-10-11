public class exercicibucle {
    public static void main(String[] args) {
        byte comptador =-50;

        while (comptador <= 50){
            System.out.print(comptador+ " es ");
            if(comptador % 2 == 0) System.out.println(" parell");
            else System.out.println(" imparell");
            comptador = (byte) (comptador+1);
        }
        System.out.println("has sortit del bucle");
    }
}
