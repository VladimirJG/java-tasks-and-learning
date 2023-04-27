package utility;

/**
 *
 */
public class CharSymbolIsVowel {
    public static void main(String[] args) {
        char startSymbol = 'g';
        printLetters(startSymbol);
    }

    private static void printLetters(char startSymbol) {
        for (char currentSymbol = startSymbol; !isVowel(currentSymbol); currentSymbol++) {
            System.out.println(currentSymbol);
        }
    }

    private static boolean isVowel(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'y';
    }
}
