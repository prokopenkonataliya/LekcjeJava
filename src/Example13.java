import java.math.BigDecimal;
import java.math.RoundingMode;

/*
Program ilustruje różnice
pomiędzy int i double
 */
public class Example13 {
    public static void main(String[] args){
        int v;//Deklaracja zmiennej typu int
        double x;//Deklaracja zmiennej typu double
        float y;
        BigDecimal bd;

        v = 10;//Prypisuje zmiennej v wartość 10
        x = 10.0;//Przypisuje zmiennej x wartość 10.0
        y = 10.0f;
        bd = new BigDecimal("10.0");

        System.out.println("Początkowa wartość zmiennej v: " + v);
        System.out.println("Początkowa wartość zmiennej x: " + x);
        System.out.println("Początkowa wartość zmiennej y: " + y);
        System.out.println("Początkowa wartość zmiennej bd: " + bd);

        System.out.println();//Wyswietla pusty wiersz
        //Dzieli wartość obu zmiennych przez 4
        v = v / 43;
        x = x / 43;
        y = y / 43;
        bd = bd.divide(new BigDecimal("43"), 50, RoundingMode.HALF_EVEN);

        System.out.println("v po dzieleniu: " + v);
        System.out.println("x po dzieleniu: " + x);
        System.out.println("y po dzieleniu: " + y);
        System.out.println("bd po dzieleniu: " + bd);
    }
}
