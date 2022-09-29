package lekcje;

public class IfDemo {
    public static void main(String[] args){
        int a;
        int b;
        int c;

        a = 2;
        b = 3;

        if(a < b)
            System.out.println("a jest mniejsze od b");
        //Poniższa instrukcja nie zostanie wykonana
        if(a == b)
            System.out.println("To wywołanie nie zostanie wykonane");
        System.out.println();

        c = a - b;//c zawiera -1

        System.out.println("c zawiera -1");
        if(c >= 0)
            System.out.println("c nie jest ujemne");
        if(c < 0)
            System.out.println("c jest ujemne");
        System.out.println();

        c = b - a;//c zawiera teraz 1

        System.out.println("c zawiera 1");
        if(c >= 0)
            System.out.println("c jest nieujemne");
        if(c < 0)
            System.out.println("c jest ujemne");
    }
}
