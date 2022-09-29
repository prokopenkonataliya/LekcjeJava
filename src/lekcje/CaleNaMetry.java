package lekcje;

public class CaleNaMetry {
    public static  void main(String[] args){
        double cala;
        double metr;
        int count;
        count = 0;

        for(metr = 1; metr <= 36; metr++){
            cala = metr * 39.37;
            System.out.println(metr + " metrów równo się " + cala + " cali");

            count++;
            if(count % 12  == 0) {
                System.out.println();
            }
        }
    }
}
