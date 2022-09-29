/*
Wyznacza liczbę cali sześciennych
w mili sześciennej
 */
public class Listing21Inches {
    public static void main(String[] args){
        long cubicInchesPerCubicMile;
        int inchesPerFoot = 12;
        int feetPerMile = 5280;
        long inchesPerMile;

        inchesPerMile = feetPerMile * inchesPerFoot;
        cubicInchesPerCubicMile = inchesPerMile * inchesPerMile * inchesPerMile;

        System.out.printf("Mila sześcienna zawiera %,d cali sześciennych.%n", cubicInchesPerCubicMile);
    }
}
