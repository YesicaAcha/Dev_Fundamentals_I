import java.util.HashMap;
import java.util.HashSet;

/**
 * Find the first duplicated element on an array.
 */
public class DuplicateFinder {

    /**
     * Finds the first duplicated element on an array.
     *
     * @param string - Array of integers to evaluate.
     * @return the first duplicated element, or -1 if there are no duplicated elements.
     */ 
    private static int findDuplicatedNumber(final int[] numbers) {
        HashSet<Integer> noDuplicatedIntegers = new HashSet<>();
        for (int number : numbers) {
            if (!noDuplicatedIntegers.add(number)) return number;
        }
        return -1;        
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 3, 3, 5, 6, 7};
        System.out.println(findDuplicatedNumber(numbers));
    }
}