package lekcje;

/*
Stosuje twierdzenie Pitagorasa
do obliczenia przeciwprostokątnej,
znając długość przyprostokątnych
 */
public class Listing22Hypot {
    public static void main(String[] args){
        double x;
        double y;
        double z;

        x = 3;
        y = 4;
        //square root
        z = Math.sqrt(x*x + y*y);
        System.out.println("Przeciwprostokątna wynosi " + z);
    }

}
