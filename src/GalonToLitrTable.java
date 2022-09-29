//Listing1.8.
public class GalonToLitrTable {
    public static void main(String[] arg){
        double gallons;
        double liters;
        int count;

        count = 0;
        for(gallons = 1; gallons <= 30; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " galonów to " + liters + " litrów");
            count++;
//W co dziesiątym wierszu wyswietlamy pusty wiersz(odstęp)
            if (count == 10) {
                System.out.println();
                count = 0;// Zerujelicznik wierszy
            }
        }
    }
}
