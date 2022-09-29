package vectors;

import java.util.Scanner;

public class ArcTg2 {
    public static void main(String[] args) {
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        x = scanner.nextDouble();
        System.out.print("Y: ");
        y = scanner.nextDouble();

        double theta = argTg2(x, y);
        System.out.println(theta);
    }

    public static double argTg2(double x, double y) {
        double theta = 0;

        if (x >= 0 && y >= 0) {
            theta = atan2(x, y);

        } else if (x < 0 && y >= 0) {
            theta = 180 - atan2(x, y);

        } else if (x < 0 && y < 0) {
            theta = 180 + atan2(x, y);

        } else if (x >= 0 && y < 0) {
            theta = 360 - atan2(x, y);

        }
        return theta;
    }

    private static double atan2(double x, double y) {
        double tg = Math.abs(y / x);
        double radians = Math.atan(tg);
        return Math.toDegrees(radians);
    }
}
