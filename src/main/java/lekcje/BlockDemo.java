package lekcje;

public class BlockDemo {
    public static void main(String[] args){
        double i;
        double j;
        double d;

        i = 5;
        j = 10;
        //Instrukcja warunkowa decyduje o wykonaniu bloku kodu
        if(i != 0){
            System.out.println("i nie jest równe zero");
            d = j / i;
            System.out.println("j / i równa się " + d);
        }
    }
}
