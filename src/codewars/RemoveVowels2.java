package codewars;

public class RemoveVowels2 {
    public static void main(String[] args){
       String str = "nisenitneca";
        String result = removeVowels(str);
        System.out.printf("%s -> %s", str, result);
    }

    private static String removeVowels(String str) {
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!isVowel(ch)) {
                output.append(ch);
            }
        }
        return output.toString();
    }

    private static boolean isVowel(char ch) {
        return switch (ch) {
            case 'a' -> true;
            case 'e' -> true;
            case 'i' -> true;
            case 'o' -> true;
            case 'u' -> true;
            case 'A' -> true;
            case 'E' -> true;
            case 'I' -> true;
            case 'O' -> true;
            case 'U' -> true;
            default -> false;
        };
    }
}
