import java.util.HashMap;
import java.util.stream.Collectors;

/**
 * Count repeating words in a string.
 *
 * Example
 * "This is is a new text text that have repeating repeating repeating words"
 *
 * //Result:
 * is:        2
 * text:      2
 * repeating: 3
 */
public class Exercise5 {

    /**
     * Counts repeating word and prints them.
     *
     * @param string - String to evaluate.
     */
    private static void countRepeatingWords(final String string) {
        String[] words = string.split("\\s");
        HashMap<String, Integer> wordsMap = new HashMap<>();

        // Compose a map with the occurrences of each word
        for (String word : words) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }

        // Print only the repeating words
        wordsMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static void main(String[] args) {
        String string = "This is is a new text text that have repeating repeating repeating words";
        countRepeatingWords(string);
    }
}