package lekcje;/*
   Demonstruje użycie zmiennych

   Nazwij plik Example2.java
    */

public class Example12 {
    public static void main(String[] args) {
        int myVar1; //Deklaracja zmiennej
        int myVar2; //Deklaracja kolejnej zmiennej

        myVar1 = 1024; //Przypisanie wartości do zmiennej
        System.out.println("myVar1 zawiera " + myVar1);

        myVar2 = myVar1 / 2;
        System.out.print("myVar2 zawiera myVar1 / 2: " );
        System.out.println(myVar2);

    }
}
