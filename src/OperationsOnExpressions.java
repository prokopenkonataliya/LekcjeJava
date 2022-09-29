public class OperationsOnExpressions {
    public static void printDisjunction(){
        System.out.println("A B A||B");

        printTableRow(true, true);
        printTableRow(true, false);
        printTableRow(false, true);
        printTableRow(false, false);
    }

    private static void printTableRow(boolean a, boolean b) {
        boolean value = a || b;
        String tfA = boolAsStr(a);
        String tfB = boolAsStr(b);
        String tfAB = boolAsStr(value);
        System.out.printf("%s %s  %s%n", tfA, tfB, tfAB);
    }

    private static String boolAsStr(boolean value) {
        if (value){
            return "T";
        }
        return "F";
    }

    public static void main(String[] args){
        printDisjunction();
    }
}
