import java.util.Scanner;

public class CarthesianCoordinates {
    public static void main(String[] args){
        double x;
        double y;
        double theta;
        double length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        length = scanner.nextDouble();
        System.out.print("Theta: ");
        theta = scanner.nextDouble();

        double radians = Math.toRadians(theta);
        x = length * Math.cos(radians);
        y = length * Math.sin(radians);

        System.out.printf("X: %.2f, y: %.2f %n", x, y );
    }

}
