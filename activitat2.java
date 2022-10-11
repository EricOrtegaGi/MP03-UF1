public class activitat2 {

    public static void main (String[] args) {

        int min = 0;
        int max = 6;

        int d6 = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(d6);
    }
}