package IntermediateJava;

public class Speller {

    public static void main(String[] args) {

        String toSpell = "conscientious";
        int wordLength = toSpell.length();

        for (int i = 0; i < wordLength; i++) {
            System.out.println(toSpell.charAt(i));
        }
    
    }
}
