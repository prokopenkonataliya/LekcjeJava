package vectors;

public class SumVectors {
    public static void main(String[] args){

        Vector v = new Vector();
        v.setLenghtTheta(7, 310);
        Vector w = new Vector();
        w.setLenghtTheta(3, 70);

        Vector u = v.sumVector(w);
        System.out.println(u.length());
        System.out.println(u.theta());

    }
}
