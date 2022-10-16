package lekcje;

import java.util.Scanner;

public class Lekcja1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("What is our name: ");
        name = scanner.next();
        System.out.print("Hello " + name);
    }
}
