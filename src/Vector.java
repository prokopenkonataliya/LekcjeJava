public class Vector {
    double x;
    double y;

    double length(){
        double x2 = x * x;
        double y2 = y * y;
        double s = x2 + y2;
        double l = Math.sqrt(s);
        return l;
    }

    double theta(){
        double t = ArcTg2.argTg2(x, y);
        return t;
    }

    void multiply(double scalar){
        x = scalar * x;
        y = scalar * y;
    }

    void setLenghtTheta(double lenght, double theta){
        double radians = Math.toRadians(theta);
        x = lenght * Math.cos(radians);
        y = lenght * Math.sin(radians);
    }

    Vector sumVector(Vector other){
        Vector sum = new Vector();
        sum.x = this.x + other.x;
        sum.y = this.y + other.y;
        return sum;
    }

    public static void main(String[] args){
        Vector v = new Vector();
        v.x = 3;
        v.y = 4;
        v.multiply(-2);
        double l = v.length();
        System.out.println("Length is " + l);
        double t = v.theta();
        System.out.println("Theta is " + t);

    }
}
