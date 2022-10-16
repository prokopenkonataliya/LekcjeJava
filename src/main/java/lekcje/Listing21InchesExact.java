package lekcje;

/*
Wyznacza liczbę cali sześciennych
w mili sześciennej
 */
public class Listing21InchesExact {
    public static void main(String[] args){
        long cubicInchesPerCubicMile;
        int inchesPerFoot = 12;
        int feetPerMile = 5280;
        long inchesPerMile;

        inchesPerMile = Math.multiplyExact(feetPerMile, inchesPerFoot);
        cubicInchesPerCubicMile = Math.multiplyExact(Math.multiplyExact(inchesPerMile, inchesPerMile), inchesPerMile);

        System.out.printf("Mila sześcienna zawiera %,d cali sześciennych.%n", cubicInchesPerCubicMile);
    }
}
