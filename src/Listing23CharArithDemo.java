//Zmienne typu char można traktować jak wartości całkowite
public class Listing23CharArithDemo {
    public static void main(String[] args){
        char ch;
        ch = 'X';
        System.out.println("ch zawiera " + ch + "("+((int)ch)+")");
        ch++;
        System.out.println("a teraz " + ch);
        ch = 90;//Zmiennej typu char można przypisać wartość cawkowitą
        System.out.println("a teraz " + ch);
    }
}
