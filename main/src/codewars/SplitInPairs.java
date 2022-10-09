package codewars;

public class SplitInPairs {

    public static String[] splitInPairs(String letters) {
        int length = letters.length();
        if (length %2 != 0){
            letters = letters + "_";
        }
        String[] pairs = new String[(length + 1) / 2];

        for (int index = 0; index < pairs.length; index++) {
            int firstIndex = index * 2;
            char firstSymbol = letters.charAt(firstIndex);

            int secondIndex = firstIndex + 1;
            char secondSymbol = letters.charAt(secondIndex);

            String pair = new String(new char[]{firstSymbol, secondSymbol});
            pairs[index] = pair;
        }
        return pairs;
    }
}
