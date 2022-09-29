package lekcje;

import java.util.Scanner;

public class GravityOnMoon {
    public static void main(String[] args){
        System.out.print("Proszę wpisać swoją wagę: ");

        double weightBodyEarth;
        Scanner scanner = new Scanner(System.in);
        weightBodyEarth = scanner.nextDouble();
        //weightBodyEarth = 55.9;

        double weighBodyMoon;
        weighBodyMoon = weightBodyEarth * 0.165;

        System.out.println("Mój ciężar na Księżycu: " + weighBodyMoon);
    }
}
