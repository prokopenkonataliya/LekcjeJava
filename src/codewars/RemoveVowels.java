package codewars;

public class RemoveVowels {
    public static void main(String[] arg){
        String trall = "disemvowel";
        String notrall = removeVowels(trall);
        System.out.println(notrall);

    }
    public static String removeVowels(String input){
     return input.replaceAll("[aAeEiIoOuU]", "");

    }
}
