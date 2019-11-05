import java.util.*;

/**
 * Checking whether two strings are anagrams.
 */
public class Exercise6 {

    /**
     * Gets characters from a string sorted into ascending numerical order.
     *
     * @param string - String to evaluate.
     * @return Array of string's characters.
     */
    private static char[] getSortedCharacters(final String string) {
        char[] characters =  string.toLowerCase().replaceAll("\\s+","").toCharArray();
        Arrays.sort(characters);
        return characters;
    }

    /**
     * Evaluates if two string are anagrams.
     *
     * @param firstString - First String.
     * @param secondString - Second String.
     */
    private static boolean areAnagrams(final String firstString, final String secondString) {
        char[] firstStringCharacters = getSortedCharacters(firstString);
        char[] secondStringCharacters = getSortedCharacters(secondString);
        return Arrays.equals(firstStringCharacters,secondStringCharacters);
    }

    public static void main(String[] args) {
        String firstString = "El loh";
        String secondString = "  HeLl o ";
        System.out.println(areAnagrams(firstString, secondString));
    }
}